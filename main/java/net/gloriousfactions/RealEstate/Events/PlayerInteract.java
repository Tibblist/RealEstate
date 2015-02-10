package net.gloriousfactions.RealEstate.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class PlayerInteract implements Listener{
    @EventHandler
    public void OnDoorOpen (PlayerInteractEvent DoorInteract) {
    	
    	if (DoorInteract.getMaterial() == Material.ACACIA_DOOR || DoorInteract.getMaterial() == Material.BIRCH_DOOR || DoorInteract.getMaterial() == Material.IRON_DOOR || DoorInteract.getMaterial() == Material.WOOD_DOOR) {
    		
    	}
    }
}
