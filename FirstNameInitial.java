package robot;

import org.jointheleague.graphical.robot.Robot;

public class FirstNameInitial {
public static void main(String[] args) {
	Robot boi= new Robot();
	boi.penDown();
	for (int i = 0; i < 3; i++) {
		boi.turn(-90);
		boi.move(100);
		
		
	}
}
}
