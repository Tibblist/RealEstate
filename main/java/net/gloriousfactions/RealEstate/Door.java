package net.gloriousfactions.RealEstate;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Door {
	String door_type = "";
	UUID door_owner;
	String door_name = "";
	public int x;
	public int y;
	public int z;
	public boolean coordsset;
	Location locs;
	House house;
	
	public Door(String in_name, Location loc, House in_house) {
		this.door_name = in_name;
		coordsset = false;
		this.locs = loc;
		this.house = in_house;
	}
	
	public void setCoords(int in_x, int in_y, int in_z) {
		if (isOverlap(in_z, in_z, in_z)) {
			return;
		} else {
			x = in_x;
			y = in_y;
			z = in_z;
			coordsset = true;
		}
	}
	
	public boolean isOverlap(int x, int y, int z) {
		return false;
	}
	
	public void updateCoords(int in_x, int in_y, int in_z) {
		
	}
	
	public Location getLocation() {
		return this.locs;
	}
	
	public boolean isOwner(UUID in_owner) {
		if (house.owner == in_owner && house.owner != null) {
			return true;
		} else {
			if (house.owner == null) {
				Player player = Bukkit.getPlayer(in_owner);
				player.sendMessage("This house has no owner! Check listings it may be for sale!");
			}
			return false;
		}
	}
}
