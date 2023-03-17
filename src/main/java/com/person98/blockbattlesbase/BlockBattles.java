package com.person98.blockbattlesbase;

import com.person98.blockbattlesbase.warps.FireWarp;
import com.person98.blockbattlesbase.warps.IceWarp;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockBattles extends JavaPlugin {
    private FireWarp firewarp;
    private IceWarp icewarp;

    @Override
    public void onEnable() {
        firewarp = new FireWarp(this);
        icewarp = new IceWarp(this);
        getServer().getPluginManager().registerEvents(firewarp, this);
        getServer().getPluginManager().registerEvents(icewarp, this);

        new UndoCommand(this, firewarp, icewarp);
    }

    @Override
    public void onDisable() {
    }
}
