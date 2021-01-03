package pybot.gathering;

import net.minecraft.entity.player.EntityPlayer;

public class GathererUtil {
	public static int playerX;
	
	public static String getPlayerX(EntityPlayer player) {
		return Integer.toString(player.getPosition().getX());
	}
	
	public static String getPlayerY(EntityPlayer player) {
		return Integer.toString(player.getPosition().getY());
	}

	public static String getPlayerZ(EntityPlayer player) {
		return Integer.toString(player.getPosition().getZ());
	}
	
}
