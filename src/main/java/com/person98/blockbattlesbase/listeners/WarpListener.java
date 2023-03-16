package com.person98.blockbattlesbase.listeners;

import com.person98.blockbattlesbase.warps.FireWarp;
import com.person98.blockbattlesbase.warps.IceWarp;
import com.person98.blockbattlesbase.warps.Warp;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class WarpListener implements Listener {

    private final Warp iceWarp;
    private final Warp fireWarp;

    public WarpListener() {
        iceWarp = new IceWarp();
        fireWarp = new FireWarp();
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType() == Material.END_ROD) {
            Material blockAboveType = event.getBlockPlaced().getRelative(0, 1, 0).getType();

            if (blockAboveType == Material.SOUL_LANTERN) {
                iceWarp.activateWarp(event);
            } else if (blockAboveType == Material.LANTERN) {
                fireWarp.activateWarp(event);
            }
        }
    }
}