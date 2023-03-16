package com.person98.blockbattlesbase.warps;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockPlaceEvent;

public class FireWarp extends Warp {

    public FireWarp() {
        super(Material.END_ROD, Material.LANTERN);
    }

    @Override
    public void activateWarp(BlockPlaceEvent event) {
        Block center = event.getBlockPlaced();
        replaceBlocks(center, Material.BLACK_CONCRETE, Material.WHITE_CONCRETE, Material.MAGMA_BLOCK, Material.YELLOW_STAINED_GLASS);
    }

    private void replaceBlocks(Block center, Material fromBlack, Material fromWhite, Material toBlack, Material toWhite) {
        int radius = 10;
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                Block block = center.getRelative(x, 0, z);
                if (block.getType() == fromBlack) {
                    block.setType(toBlack);
                } else if (block.getType() == fromWhite) {
                    block.setType(toWhite);
                }
            }
        }
    }
}
