
package com.person98.blockbattlesbase.warps;

import com.person98.blockbattlesbase.BlockBattles;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.*;

public class FireWarp implements Listener {

    private BlockBattles plugin;
    private HashMap<Block, Long> endRodPlacements;
    private Deque<List<BlockState>> blockStatesStack;

    public FireWarp(BlockBattles plugin) {
        this.plugin = plugin;
        this.endRodPlacements = new HashMap<>();
        this.blockStatesStack = new ArrayDeque<>();
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() == Material.END_ROD) {
            endRodPlacements.put(block, System.currentTimeMillis());
        } else if (block.getType() == Material.LANTERN) {
            Block endRodBlock = block.getRelative(0, -1, 0);
            Long placementTime = endRodPlacements.remove(endRodBlock);

            if (placementTime != null && System.currentTimeMillis() - placementTime <= 2000) {
                swapBlocks(block);
            }
        }
    }

    public void undoLastWarp() {
        if (blockStatesStack.isEmpty()) {
            return;
        }

        List<BlockState> lastBlockStates = blockStatesStack.pop();
        for (BlockState blockState : lastBlockStates) {
            blockState.update(true);
        }
    }

    private void swapBlocks(Block lantern) {
        List<BlockState> blockStates = new ArrayList<>();

        Bukkit.getScheduler().runTask(plugin, () -> {
            for (int x = -10; x <= 10; x++) {
                for (int y = -10; y <= 10; y++) {
                    for (int z = -10; z <= 10; z++) {
                        Block block = lantern.getLocation().add(x, y, z).getBlock();
                        Material type = block.getType();

                        if (type == Material.WHITE_CONCRETE || type == Material.WHITE_CONCRETE_POWDER) {
                            blockStates.add(block.getState());
                            block.setType(Material.YELLOW_STAINED_GLASS);
                        } else if (type == Material.BLACK_CONCRETE_POWDER || type == Material.BLACK_CONCRETE) {
                            blockStates.add(block.getState());
                            block.setType(Material.MAGMA_BLOCK);
                        }
                    }
                }
            }

            blockStatesStack.push(blockStates);
        });
    }
}