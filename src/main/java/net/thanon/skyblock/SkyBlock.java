package net.thanon.skyblock;

import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlock extends JavaPlugin {
    SkyBlock instance;
    Configuration mainCfg;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        mainCfg = getConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public SkyBlock getInstance() {
        return instance;
    }

    public Configuration getMainCfg() {
        return mainCfg;
    }
}
