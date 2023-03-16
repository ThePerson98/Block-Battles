package com.person98.blockbattlesbase.warps;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public abstract class Warp implements Listener {
    private final Material endRodMaterial;
    private final Material lanternMaterial;

    public Warp(Material endRodMaterial, Material lanternMaterial) {
        this.endRodMaterial = endRodMaterial;
        this.lanternMaterial = lanternMaterial;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        if (isEndRodWithLantern(block)) {
            activateWarp(event);
        }
    }

    protected boolean isEndRodWithLantern(Block block) {
        return block.getType() == endRodMaterial &&
                block.getRelative(0, 1, 0).getType() == lanternMaterial;
    }

    protected abstract void activateWarp(BlockPlaceEvent event);
}
