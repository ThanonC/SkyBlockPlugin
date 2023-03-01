package net.thanon.skyblock.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {
    private ItemStack item;
    private ItemMeta im;
    public ItemBuilder(Material material) {
        item = new ItemStack(material);
        im = item.getItemMeta();
    }
    public ItemStack build() {
        item.setItemMeta(im);
        return item;
    }
}
