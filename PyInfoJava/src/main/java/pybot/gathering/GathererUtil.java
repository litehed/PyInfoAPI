package pybot.gathering;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;

public class GathererUtil {
	public static int playerX;
	public static double walkSpeed;
	
	public static String getPlayerX(EntityPlayer player) {
		return Integer.toString(player.getPosition().getX());
	}
	
	public static String getPlayerY(EntityPlayer player) {
		return Integer.toString(player.getPosition().getY());
	}

	public static String getPlayerZ(EntityPlayer player) {
		return Integer.toString(player.getPosition().getZ());
	}
	
	public static void movesForward(EntityPlayer player, int blocks) {
		System.out.println(player.getHorizontalFacing());
		System.out.println("TargetPos: " + (player.getPosition().getX() + blocks));
		System.out.println("CurrentPos: " + player.getPosition().getX());
	}
	
	public static void moveForward(EntityPlayer player, int blocks) {
		while(player.getPosition().getX() < player.getPosition().getX()+blocks || player.getPosition().getY() < player.getPosition().getY()+blocks) {
			if(player.getHorizontalFacing() == EnumFacing.EAST)
				player.motionX = 0.11785249890094988;
			else if(player.getHorizontalFacing() == EnumFacing.WEST)
				player.motionX = -0.11785249890094988;
			else if(player.getHorizontalFacing() == EnumFacing.NORTH)
				player.motionY = -0.11785249890094988;
			else if(player.getHorizontalFacing() == EnumFacing.SOUTH)
				player.motionY = 0.11785249890094988;
		}
	}
	
	public static void debug(String str) {
		System.out.println(str);
	}
	
}
