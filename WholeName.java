package robot;

import org.jointheleague.graphical.robot.Robot;

public class WholeName {
public static void main(String[] args) {
	Robot lol= new Robot();
	lol.setSpeed(10);
lol.penDown();
for (int i = 0; i < 3; i++) {
	lol.turn(-90);
	lol.move(100);
}
lol.penUp();
lol.move(40);
lol.penDown();
lol.turn(-60);
lol.move(120);
lol.turn(110);
lol.move(120);
lol.turn(180);
lol.move(55);
lol.turn(-50);
lol.move(80);
lol.turn(180);
lol.penUp();
lol.move(140);
lol.turn(90);
lol.move(55);
lol.turn(180);
lol.penDown();
lol.move(100);
for (int i = 0; i < 3; i++) {
	lol.turn(90);
	lol.move(45);
}
lol.turn(-130);
lol.move(80);




	

}
}