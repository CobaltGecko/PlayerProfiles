package me.cobaltgecko.playerprofiles.Files;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Profiles {

    private static File file;
    private static FileConfiguration profiles;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("PlayerProfiles").getDataFolder(), "profiles.yml");

        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){

            }
        }
        profiles = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return profiles;
    }

    public static void save(){
        try{
            profiles.save(file);
        }catch (IOException e){
            System.out.println("Error saving file");
        }
    }

    public static void reload(){
        profiles = YamlConfiguration.loadConfiguration(file);
    }
}
