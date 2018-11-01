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
	
private Point position;
private int positionX;
private int positionY;
public int[] coordinates;
int val;
	/**
	 * @param args
	 */

//Person (String inputCoordinates){
	/*stringSplitter splitCoord = new stringSplitter(inputCoordinates, " ");
	inputCoordinates = Integer.parseInt(splitCoord.getIntegers());
	position = new Point((inputCoord[0]), inputCoord[1]);
	positionX = position.x;
	positionY = position.y;*/
	
	//String[] splitCoord = inputCoordinates.split(" ");
	//this.positionX = Integer.parseInt(splitCoord[0]);
	//this.positionY = Integer.parseInt(splitCoord[1]);
//} 


Person (){
	Random randGem;
	randGem = new Random();
	positionX = randGem.nextInt(5) + 2;
	positionY = randGem.nextInt(5) + 2;
}
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
