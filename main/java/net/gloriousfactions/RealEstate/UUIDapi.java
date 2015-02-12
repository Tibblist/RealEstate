package net.gloriousfactions.RealEstate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.UUID;

public class UUIDapi {
public static String getName(String UUID) {
try {
URL url = new URL("[url]https://api.mojang.com/user/profiles/[/url]"+ UUID.replaceAll("-", "") + "/names");
BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
String line = in.readLine();
line = line.replace("[\"", "");
line = line.replace("\"]", "");
return line;
} catch (Exception ex) {
ex.printStackTrace();
}
return null;
}
}