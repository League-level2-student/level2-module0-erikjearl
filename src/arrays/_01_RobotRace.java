package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	
	//2. create an array of 5 robots.
		int numBots = 20;
		Robot[] rList = new Robot[numBots];
		
	//3. use a for loop to initialize the robots.
		int y = 850/numBots;
		int x = 570;
		
		for (int i = 0; i< rList.length; i++) {
			
			rList[i] = new Robot(y,x);
			y+= 800/numBots;
			rList[i].miniaturize();
			rList[i].setSpeed(25);
		}
	
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
		
		Random r = new Random();
		
		int first = 0; 
		
			while(rList[first].getY() > 50) {
		
				for (int i=0; i<rList.length; i++) {
					rList[i].move(r.nextInt(50));
					
			
					if (rList[i].getY()< first) {
						first = i;
					}
				}
		}
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
			System.out.println("The winner is robot number " + first);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
			
	}
}
