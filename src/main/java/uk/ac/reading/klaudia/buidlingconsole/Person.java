/**
 * 
 */
package uk.ac.reading.klaudia.buidlingconsole;

import java.awt.Point;
import java.util.Random;

/**
 * @author klaud
 *
 */
public class Person {

	private int positionX;
private int positionY;


Person (){
	Random randGem;
	randGem = new Random();
	positionX = randGem.nextInt(5) + 2;
	positionY = randGem.nextInt(5) + 2;
}

Person (int maxX)
public int getX() {
	return positionX;
}

public void setX(int newX) {
	positionX = newX;
}

public int getY() {
	return positionY;
}

public void setY(int newY) {
	positionY = newY;
}

/*public static void showPerson() {
	Person p = new Person();
	int[][] personArray;
	if(xSize ==p.positionX && ySize== p.positionY) {
		
	}
}*/

public String toString() {
	return "The person is at: " + positionX + "," + 
positionY + "\n";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Person p = new Person();
System.out.println(p.toString());
	}*/

}}
