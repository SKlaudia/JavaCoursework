/**
 * 
 */
package uk.ac.reading.klaudia.buidlingconsole;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author klaudia
 *
 */
public class Building {

	/**
	 * @param args
	 */

private Point  buildingSize;
private static int xSize; //building
private static int ySize;
private ArrayList<Room_main> allRooms; //info on rooms
static char[][] display;
static Building building;

Building (String inputString){
	setBuilding(inputString);
	
}

public void setBuilding(String inputString ) {
	allRooms = new ArrayList();
	
	String[] roomsAsString = inputString.split(";");
	this.xSize = Integer.parseInt(roomsAsString[0].split(" ")[0]);
	this.ySize = Integer.parseInt(roomsAsString[0].split(" ")[1]);
	
	for(int i=1; i<roomsAsString.length; i++) {
		this.allRooms.add(new Room_main(roomsAsString[i]));
		
	}


}

public int getxSize() {
	return xSize;
}

public int getySize() {
	return ySize;
}

public String toString() {
	return "Building size:" + xSize + "," + ySize + "\n"
+ "Rooms:" + allRooms;
}
/*public static char[][] doDisplay() {
	
	display = new char[getxSize()][getySize()];
	for (char[] row : display) {
		Arrays.fill(row, '#');
		
	for (char[] collumn: display) {
		Arrays.fill(collumn, '#');
	}
	}

	System.out.println(Arrays.deepToString(display));
	System.out.println("\n");
	return display;
}
*/
public void doDisplay(){
	/*for (int i = 0; i<xSize; i++) {
		System.out.print("#");
	}
	System.out.println();
	
	for(int i=0; i<ySize-2;i++) {
		System.out.print("#");
		for(int k=0;k<xSize-2;k++) {
			System.out.print(" ");
		}
		System.out.print("#");
		System.out.println();
	}
	for (int i=0; i<xSize;i++) {
		System.out.print("#");
	}
	*/
	Person a = new Person();
	

	
	display = new char[ySize][xSize];
	Map<Point,String> wallsOfRooms = new HashMap<>();
	for( Room_main room: allRooms) {
	wallsOfRooms.putAll(room.showRoom());
	}
	
	//draw outline of building + person
	for (int x = 0; x < xSize; x++) {
		for (int y = 0; y < ySize; y++) {
			if (x == a.getX() && y == a.getY()) {
				display[y][x] = 'P';
			}
			
			if(wallsOfRooms.containsKey(new Point(x,y))) {
			display[y][x] =  wallsOfRooms.get(new Point(x,y)).charAt(0) ;	
			}
		
			if (x ==0 || y == 0) {
				display[y][x] = '#';
			}
			if (x == xSize-1 || y == ySize-1) {
				display[y][x] = '#';
			}
			
		}
	}
	
	for (int i = 0; i < display.length; i++) {
		System.out.print(display[i]);
		System.out.print("\n");

	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person a = new Person();
//Building b = new Building("11 11;0 0 5 5 3 5;6 0 10 10 6 6;0 5 5 10 2 5");
//System.out.println(b.toString() + "\n" +a.toString());
//doDisplay();

	}

}
