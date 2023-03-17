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

    public Inventory createGUI() {
        Inventory gui = Bukkit.createInventory(null, InventoryType.CHEST, ChatColor.AQUA + "Warp Selector");

        // Firewarp button
        ItemStack firewarpItem = new ItemStack(Material.END_ROD);
        ItemMeta firewarpMeta = firewarpItem.getItemMeta();
        firewarpMeta.setDisplayName(ChatColor.RED + "Firewarp");
        firewarpItem.setItemMeta(firewarpMeta);
        gui.setItem(0, firewarpItem);

        // Icewarp button
        ItemStack icewarpItem = new ItemStack(Material.PACKED_ICE);
        ItemMeta icewarpMeta = icewarpItem.getItemMeta();
        icewarpMeta.setDisplayName(ChatColor.BLUE + "Icewarp");
        icewarpItem.setItemMeta(icewarpMeta);
        gui.setItem(1, icewarpItem);

        // Snowwarp Button

        ItemStack snowwarpItem = new ItemStack(Material.SNOW_BLOCK);
        ItemMeta snowwarpMeta = snowwarpItem.getItemMeta();
        snowwarpMeta.setDisplayName(ChatColor.WHITE + "Snowwarp");
        snowwarpItem.setItemMeta(snowwarpMeta);
        gui.setItem(2, snowwarpItem);

        //Amethyst Warp

        ItemStack amethystwarpItem = new ItemStack(Material.AMETHYST_BLOCK);
        ItemMeta amethystwarpMeta = amethystwarpItem.getItemMeta();
        amethystwarpMeta.setDisplayName(ChatColor.DARK_PURPLE + "Amethystwarp");
        amethystwarpItem.setItemMeta(amethystwarpMeta);
        gui.setItem(3, amethystwarpItem);

        //Book Warp

        ItemStack bookwarpItem = new ItemStack(Material.BOOK);
        ItemMeta bookwarpMeta = bookwarpItem.getItemMeta();
        bookwarpMeta.setDisplayName(ChatColor.WHITE + "Bookwarp");
        bookwarpItem.setItemMeta(bookwarpMeta);
        gui.setItem(4, bookwarpItem);

        //Desert Warp

        ItemStack desertwarpItem = new ItemStack(Material.SANDSTONE);
        ItemMeta desertwarpMeta = desertwarpItem.getItemMeta();
        desertwarpMeta.setDisplayName(ChatColor.WHITE + "Desertwarp");
        desertwarpItem.setItemMeta(desertwarpMeta);
        gui.setItem(5, desertwarpItem);

        //End Warp

        ItemStack endwarpItem = new ItemStack(Material.END_STONE);
        ItemMeta endwarpMeta = endwarpItem.getItemMeta();
        endwarpMeta.setDisplayName(ChatColor.YELLOW + "Endwarp");
        endwarpItem.setItemMeta(endwarpMeta);
        gui.setItem(6, endwarpItem);

        //Firework Warp

        ItemStack fireworkwarpItem = new ItemStack(Material.FIREWORK_ROCKET);
        ItemMeta fireworkwarpMeta = fireworkwarpItem.getItemMeta();
        fireworkwarpMeta.setDisplayName(ChatColor.YELLOW + "Fireworkwarp");
        fireworkwarpItem.setItemMeta(fireworkwarpMeta);
        gui.setItem(7, fireworkwarpItem);

        //Mushroom Warp

        ItemStack mushroomwarpItem = new ItemStack(Material.BROWN_MUSHROOM_BLOCK);
        ItemMeta mushroomwarpMeta = mushroomwarpItem.getItemMeta();
        mushroomwarpMeta.setDisplayName(ChatColor.YELLOW + "Mushroomwarp");
        mushroomwarpItem.setItemMeta(mushroomwarpMeta);
        gui.setItem(8, mushroomwarpItem);

        //Ocean Warp

        ItemStack oceanwarpItem = new ItemStack(Material.WATER_BUCKET);
        ItemMeta oceanwarpMeta = oceanwarpItem.getItemMeta();
        oceanwarpMeta.setDisplayName(ChatColor.BLUE + "Oceanwarp");
        oceanwarpItem.setItemMeta(oceanwarpMeta);
        gui.setItem(9, oceanwarpItem);

        //Sky Warp

        ItemStack skywarpItem = new ItemStack(Material.FEATHER);
        ItemMeta skywarpMeta = skywarpItem.getItemMeta();
        skywarpMeta.setDisplayName(ChatColor.BLUE + "Skywarp");
        skywarpItem.setItemMeta(skywarpMeta);
        gui.setItem(10, skywarpItem);

        //Sun Warp

        ItemStack sunwarpItem = new ItemStack(Material.SUNFLOWER);
        ItemMeta sunwarpMeta = sunwarpItem.getItemMeta();
        sunwarpMeta.setDisplayName(ChatColor.YELLOW + "Sunwarp");
        sunwarpItem.setItemMeta(sunwarpMeta);
        gui.setItem(11, sunwarpItem);

        //Time Warp

        ItemStack timewarpItem = new ItemStack(Material.CLOCK);
        ItemMeta timewarpMeta = timewarpItem.getItemMeta();
        timewarpMeta.setDisplayName(ChatColor.RED + "Timewarp");
        timewarpItem.setItemMeta(timewarpMeta);
        gui.setItem(12, timewarpItem);

        //Void Warp

        ItemStack viodwarpItem = new ItemStack(Material.BLACK_CONCRETE);
        ItemMeta viodwarpMeta = viodwarpItem.getItemMeta();
        viodwarpMeta.setDisplayName(ChatColor.GRAY + "Voidwarp");
        viodwarpItem.setItemMeta(viodwarpMeta);
        gui.setItem(13, viodwarpItem);

        //Sculk Warp

        ItemStack sculkwarpItem = new ItemStack(Material.SCULK_CATALYST);
        ItemMeta sculkwarpMeta = sculkwarpItem.getItemMeta();
        sculkwarpMeta.setDisplayName(ChatColor.DARK_PURPLE + "Sculkwarp");
        sculkwarpItem.setItemMeta(sculkwarpMeta);
        gui.setItem(14, sculkwarpItem);

        //Storm

        ItemStack stormwarpItem = new ItemStack(Material.WHITE_STAINED_GLASS);
        ItemMeta stormwarpMeta = stormwarpItem.getItemMeta();
        stormwarpMeta.setDisplayName(ChatColor.WHITE + "Stormwarp");
        stormwarpItem.setItemMeta(stormwarpMeta);
        gui.setItem(15, stormwarpItem);

        //Grass Field Combo

        ItemStack grasswarpItem = new ItemStack(Material.GRASS);
        ItemMeta grasswarpMeta = grasswarpItem.getItemMeta();
        grasswarpMeta.setDisplayName(ChatColor.GREEN + "GrassFieldCombowarp");
        grasswarpItem.setItemMeta(grasswarpMeta);
        gui.setItem(16, grasswarpItem);

        //Space Warp

        ItemStack spacewarpItem = new ItemStack(Material.WHITE_SHULKER_BOX);
        ItemMeta spacewarpMeta = spacewarpItem.getItemMeta();
        spacewarpMeta.setDisplayName(ChatColor.DARK_GRAY + "Spacewarp");
        spacewarpItem.setItemMeta(spacewarpMeta);
        gui.setItem(17, spacewarpItem);

        //Redstone Warp

        ItemStack redstonewarpItem = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta redstonewarpMeta = redstonewarpItem.getItemMeta();
        redstonewarpMeta.setDisplayName(ChatColor.RED + "Redstonewarp");
        redstonewarpItem.setItemMeta(redstonewarpMeta);
        gui.setItem(18, redstonewarpItem);


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
        } else if (clickedItem.getType() == Material.SNOW_BLOCK && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Snowwarp")) {
            player.getInventory().addItem(new ItemStack(Material.SNOW_BLOCK));
            player.getInventory().addItem(new ItemStack(Material.WHITE_STAINED_GLASS));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.AMETHYST_BLOCK && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Amethystwarp")) {
            player.getInventory().addItem(new ItemStack(Material.AMETHYST_CLUSTER));
            ItemStack obsidianStack = new ItemStack(Material.OBSIDIAN, 4);
            player.getInventory().addItem(obsidianStack);
            player.closeInventory();
        } else if (clickedItem.getType() == Material.BOOK && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Bookwarp")) {
            player.getInventory().addItem(new ItemStack(Material.BOOKSHELF));
            player.getInventory().addItem(new ItemStack(Material.LECTERN));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.SANDSTONE && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Desertwarp")) {
            ItemStack soultorchStack = new ItemStack(Material.SOUL_TORCH, 4);
            player.getInventory().addItem(soultorchStack);
            ItemStack sandstoneStack = new ItemStack(Material.SANDSTONE, 5);
            player.getInventory().addItem(sandstoneStack);
            player.closeInventory();
        } else if (clickedItem.getType() == Material.FEATHER && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Skywarp")) {
            ItemStack amethystStack = new ItemStack(Material.AMETHYST_CLUSTER, 4);
            player.getInventory().addItem(amethystStack);
            player.getInventory().addItem(new ItemStack(Material.DRAGON_EGG));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.BROWN_MUSHROOM_BLOCK && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Mushroomwarp")) {
            ItemStack mushroomStack = new ItemStack(Material.RED_MUSHROOM_BLOCK, 4);
            player.getInventory().addItem(mushroomStack);
            player.getInventory().addItem(new ItemStack(Material.SHROOMLIGHT));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.END_STONE && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Endtwarp")) {
            ItemStack endstoneStack = new ItemStack(Material.END_STONE, 4);
            player.getInventory().addItem(endstoneStack);
            player.getInventory().addItem(new ItemStack(Material.ITEM_FRAME));
            player.getInventory().addItem(new ItemStack(Material.ENDER_EYE));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.BLACK_CONCRETE && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Voidwarp")) {
            ItemStack coalblockStack = new ItemStack(Material.COAL_BLOCK, 4);
            player.getInventory().addItem(coalblockStack);
            player.getInventory().addItem(new ItemStack(Material.BLACK_BANNER));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.SUNFLOWER && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Sunwarp")) {
            player.getInventory().addItem(new ItemStack(Material.TORCH));
            player.getInventory().addItem(new ItemStack(Material.CAMPFIRE));
            player.closeInventory();
        } else if (clickedItem.getType() == Material.WATER_BUCKET && clickedItem.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Oceanwarp")) {
            ItemStack kelpblockStack = new ItemStack(Material.DRIED_KELP_BLOCK, 4);
            player.getInventory().addItem(kelpblockStack);
            player.getInventory().addItem(new ItemStack(Material.TURTLE_EGG));
            player.closeInventory();
        }
    }

}
