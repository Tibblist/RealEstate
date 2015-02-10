package net.gloriousfactions.RealEstate;

import java.util.UUID;

import org.bukkit.Location;

public class Door {
	String door_type = "";
	UUID door_owner;
	String door_name = "";
	public int x;
	public int y;
	public int z;
	public boolean coordsset;
	Location locs;
	
	public Door(String in_name, UUID in_owner, Location loc) {
		this.door_owner = in_owner;
		this.door_name = in_name;
		coordsset = false;
		this.locs = loc;
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
	
	public UUID getOwner() {
		return this.door_owner;
	}
}
