package com.person98.blockbattlesbase.commands;

import com.person98.blockbattlesbase.BlockBattles;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OpenGUICommand implements CommandExecutor {

    private BlockBattles plugin;

    public OpenGUICommand(BlockBattles plugin) {
        this.plugin = plugin;
        plugin.getCommand("openwarpgui").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        Inventory gui = Bukkit.createInventory(null, 9, "Warp GUI");

        ItemStack fireWarpItem = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta fireWarpMeta = fireWarpItem.getItemMeta();
        if (fireWarpMeta != null) {
            fireWarpMeta.setDisplayName("FireWarp");
            fireWarpItem.setItemMeta(fireWarpMeta);
        }

        gui.setItem(4, fireWarpItem);

        player.openInventory(gui);
        return true;
    }
}
