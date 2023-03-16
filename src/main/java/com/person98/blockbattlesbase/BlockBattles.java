package com.person98.blockbattlesbase;

import com.person98.blockbattlesbase.warps.FireWarp;
import com.person98.blockbattlesbase.warps.IceWarp;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockBattles extends JavaPlugin implements Listener {
    private final IceWarp iceWarp = new IceWarp();
    private final FireWarp fireWarp = new FireWarp();

    @Override
    public void onEnable() {
        // Register the event listeners
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(iceWarp, this);
        getServer().getPluginManager().registerEvents(fireWarp, this);

        // Set the plugin command executor
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        if (isEndRodWithLantern(block)) {
            fireWarp.activateWarp(event);
        } else if (isEndRodWithSoulLantern(block)) {
            iceWarp.activateWarp(event);
        }
    }

    private boolean isEndRodWithLantern(Block block) {
        return block.getType() == Material.END_ROD &&
                block.getRelative(0, 1, 0).getType() == Material.LANTERN;
    }

    private boolean isEndRodWithSoulLantern(Block block) {
        return block.getType() == Material.END_ROD &&
                block.getRelative(0, 1, 0).getType() == Material.SOUL_LANTERN;
    }
}
