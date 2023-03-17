package com.person98.blockbattlesbase.handlers;

import com.person98.blockbattlesbase.BlockBattles;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIEventHandler implements Listener {

    private BlockBattles plugin;

    public GUIEventHandler(BlockBattles plugin) {
        this.plugin = plugin;
    }

    private Inventory createGUI() {
        Inventory gui = Bukkit.createInventory(null, InventoryType.CHEST, ChatColor.AQUA + "Warp Selector");

        // Firewarp button
        ItemStack firewarpItem = new ItemStack(Material.END_ROD);
        ItemMeta firewarpMeta = firewarpItem.getItemMeta();
        firewarpMeta.setDisplayName(ChatColor.RED + "Firewarp");
        firewarpItem.setItemMeta(firewarpMeta);
        gui.setItem(11, firewarpItem);

        // Icewarp button
        ItemStack icewarpItem = new ItemStack(Material.PACKED_ICE);
        ItemMeta icewarpMeta = icewarpItem.getItemMeta();
        icewarpMeta.setDisplayName(ChatColor.BLUE + "Icewarp");
        icewarpItem.setItemMeta(icewarpMeta);
        gui.setItem(13, icewarpItem);

        return gui;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.AQUA + "Warp Selector")) {
            return;
        }

        event.setCancelled(true);

        ItemStack clickedItem = event.getCurrentItem();
        if (clickedItem == null || clickedItem.getType() == Material.AIR) {
            return;
        }

        Player player = (Player) event.getWhoClicked();

        if (clickedItem.getType() == Material.END_ROD && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.RED + "Firewarp")) {
            player.getInventory().addItem(new ItemStack(Material.END_ROD));
            player.getInventory().addItem(new ItemStack(Material.LANTERN));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.PACKED_ICE && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Icewarp")) {
            player.getInventory().addItem(new ItemStack(Material.END_ROD));
            player.getInventory().addItem(new ItemStack(Material.SOUL_LANTERN));
            player.closeInventory();
        }
    }
}
