package net.gloriousfactions.RealEstate;

import net.gloriousfactions.RealEstate.Events.PlayerInteract;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class RealEstate extends JavaPlugin implements Listener{
    @Override
    public void onEnable() {
    	getLogger().info("RealEstate has been enabled!");
    	this.getCommand("basic").setExecutor(new RealEstateCommandExecutor(this));
    	PluginManager pm = Bukkit.getPluginManager();
    	pm.registerEvents(new PlayerInteract(), this);
    }
    
 
    @Override
    public void onDisable() {
    	getLogger().info("RealEstate has been disabled!");
    }
    
}
