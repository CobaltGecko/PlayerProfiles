package me.cobaltgecko.playerprofiles.Events;

import me.cobaltgecko.playerprofiles.Files.Profiles;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import java.time.LocalDate;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();


        FileConfiguration data = Profiles.get();

        data.set("players." + player.getName() + ".uuid", player.getUniqueId().toString());
        Profiles.save();

        if(!data.contains("players." + player.getName() + ".first-join")) {
            data.set("data.players-joined", data.getInt("data.players-joined") + 1);
            data.set("players." + player.getName() + ".first-join", LocalDate.now().toString());
            data.set("players." + player.getName() + ".counter", data.getInt("data.players-joined"));
            Profiles.save();
        }


    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        FileConfiguration data = Profiles.get();

        data.set("players." + player.getName() + ".leave-date", LocalDate.now().toString());
        Profiles.save();

    }
}
