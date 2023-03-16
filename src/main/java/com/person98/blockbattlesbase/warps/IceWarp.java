package com.person98.blockbattlesbase.warps;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockPlaceEvent;

public class IceWarp extends Warp {

    public IceWarp() {
        super(Material.END_ROD, Material.SOUL_LANTERN);
    }

    @Override
    public void activateWarp(BlockPlaceEvent event) {
        Block center = event.getBlockPlaced();
        replaceIceBlocks(center, Material.BLACK_CONCRETE, Material.WHITE_CONCRETE, Material.PACKED_ICE, Material.BLUE_STAINED_GLASS);
    }

    private void replaceIceBlocks(Block center, Material fromBlack, Material fromWhite, Material toBlack, Material toWhite) {
        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
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
