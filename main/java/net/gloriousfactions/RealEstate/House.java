package net.gloriousfactions.RealEstate;

import java.util.UUID;

public class House {
	String name;
	UUID owner;
	int doorCount;
	int price;
	
	public House(String in_name, UUID in_owner, int in_doorCount, int in_price) {
		name = in_name;
		owner = in_owner;
		doorCount = in_doorCount;
		price = in_price;
	}
}
