package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		Robot robArr[] = new Robot[5];
		Robot.setWindowSize(500, 500);

		for (int i = 0; i < 5; i++) {
			robArr[i] = new Robot();
			robArr[i].setY(490);
			robArr[i].setX((i * 100) + 100);
		}

		Random r = new Random();
		int num;

		boolean e = true;

		while (e) {
			for (int i = 0; i < robArr.length; i++) {
				num = r.nextInt(50);
				robArr[i].move(num);
				if (robArr[i].getY() < 10) {
					e = false;
				}
			}
		}

		for (int i = 0; i < robArr.length; i++) {
			if (robArr[i].getY() <= 10) {
				JOptionPane.showMessageDialog(null, "Congratulations! Robot #" + i + 1 + " has won!!");
				robArr[i].sparkle();
				break;
			}
		}
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
