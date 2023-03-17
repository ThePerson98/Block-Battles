package com.person98.blockbattlesbase;

import com.person98.blockbattlesbase.warps.FireWarp;
import com.person98.blockbattlesbase.warps.IceWarp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UndoCommand implements CommandExecutor {
    private FireWarp firewarp;
    private IceWarp icewarp;

    public UndoCommand(BlockBattles plugin, FireWarp firewarp, IceWarp icewarp) {
        this.firewarp = firewarp;
        this.icewarp = icewarp;
        plugin.getCommand("warpundo").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (!args[0].equalsIgnoreCase("fire") && !args[0].equalsIgnoreCase("ice")) {
            sender.sendMessage("Usage: /warpundo <fire|ice>");
            return true;
        }

        if (args[0].equalsIgnoreCase("fire")) {
            firewarp.undoLastWarp();
            sender.sendMessage("The last Firewarp has been undone.");
        } else {
            icewarp.undoLastWarp();
            sender.sendMessage("The last Icewarp has been undone.");
        }

        return true;
    }
}