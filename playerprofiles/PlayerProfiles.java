package me.cobaltgecko.playerprofiles;

import me.cobaltgecko.playerprofiles.Events.onPlayerJoin;
import me.cobaltgecko.playerprofiles.Files.Profiles;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerProfiles extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
        Profiles.setup();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
