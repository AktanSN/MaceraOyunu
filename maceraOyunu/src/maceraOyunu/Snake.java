package maceraOyunu;

import java.util.Random;

public class Snake extends Obstacle{
	public static Random rnd = new Random();
	private static int num= rnd.nextInt(4)+3;
	
	
	public Snake() {
		
		
		super("Y�lan", 0, 4, num , 12);
		
	}
	
	
	
	

}
