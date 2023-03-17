package com.person98.blockbattlesbase.commands;

import com.person98.blockbattlesbase.BlockBattles;
import com.person98.blockbattlesbase.handlers.GUIEventHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenGUICommand implements CommandExecutor {

    private BlockBattles plugin;
    private GUIEventHandler guiEventHandler;

    public OpenGUICommand(BlockBattles plugin) {
        this.plugin = plugin;
        this.guiEventHandler = new GUIEventHandler(plugin);
        plugin.getCommand("openwarpgui").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        player.openInventory(guiEventHandler.createGUI());
        return true;
    }
}
