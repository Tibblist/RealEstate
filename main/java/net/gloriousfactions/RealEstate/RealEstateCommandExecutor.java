package net.gloriousfactions.RealEstate;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class RealEstateCommandExecutor implements CommandExecutor {
	private final RealEstate plugin;
 
	public RealEstateCommandExecutor(RealEstate plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("re create")) { // If the player typed /basic then do the following...
			if (sender instanceof Player) {
		           Player player = (Player) sender;
		           // do something
		        } else {
		           sender.sendMessage("You must be a player!");
		           return false;
		        }
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the value of false will be returned.
		return false; 
	}
}
