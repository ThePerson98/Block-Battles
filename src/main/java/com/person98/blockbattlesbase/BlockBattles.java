package com.person98.blockbattlesbase;

import com.person98.blockbattlesbase.commands.OpenGUICommand;
import com.person98.blockbattlesbase.commands.UndoCommand;
import com.person98.blockbattlesbase.handlers.GUIEventHandler;
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

        GUIEventHandler guiEventHandler = new GUIEventHandler(this);
        getServer().getPluginManager().registerEvents(guiEventHandler, this);

        new UndoCommand(this, firewarp, icewarp);
        new OpenGUICommand(this);
    }

    @Override
    public void onDisable() {
    }
}
