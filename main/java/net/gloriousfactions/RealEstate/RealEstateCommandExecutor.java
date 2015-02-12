package net.gloriousfactions.RealEstate;
import java.awt.List;
import java.util.ArrayList;

import net.gloriousfactions.RealEstate.House;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class RealEstateCommandExecutor implements CommandExecutor {
	public final RealEstate plugin;
	ArrayList<House> houseArray = new ArrayList<House>();
 
	public RealEstateCommandExecutor(RealEstate plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("re create house")) { // If the player typed /basic then do the following...
			if (sender instanceof Player) {
				Player player = (Player) sender;
		           if(args[0] != null) {
		        	   for (int i=0; i <= houseArray.size(); i++) {
		        		   if (houseArray.contains(args[0])) {
		        			   sender.sendMessage("This house name is already taken");
		        		   } else {
		        			   if (args[1] != null) {
		        				   try {
		        					   int p = Integer.parseInt(args[1]);
		        					   houseArray.add(new House(args[0], player.getUniqueId(), 0, p));
		        					   
		        				   } catch(NumberFormatException e) {
		        					   sender.sendMessage("Please enter an integer value for house price");
		        				   } finally {
		        					   
		        				   }
		        			   } else {
		        				   
		        			   }
		        		   }
		        	   }
		           } else {
		        	   sender.sendMessage("You must name the house!");
		           }
		        } else {
		           sender.sendMessage("You must be a player!");
		           return false;
		        }
			return true;
		}
		
		return false; 
	}
}
