/**
 *
 */
package uk.ac.reading.klaudia.buidlingconsole;

import java.awt.Point;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author klaudia
 */
public class Room {
    private String bottomCorner, topCorner, doorPosition, size;

    /**
     * @param string
     * @param args
     */
    static int x = 0;
    static int y = 0;

    Room(String roomAsString) {
        /*int splits = r.indexOf(" ");*/
		
		/*bottomCorner= r.substring(0, splits);
		topCorner=r.substring(splits+1, 7);
		doorPosition=r.substring(7, r.length());*/
        Point bottomCorner = new Point(0, 0);
        Point topCorner = new Point(5, 5);
        Point doorPosition = new Point(0, 2);
    }

    public void isInRoom() {
        Point P = new Point(x, y);
        P.getX();
        P.getY();
        if ((x < 5) && (y < 5)) {
            System.out.println("Is in room");
        } else {
            System.out.println("Is not in room");
        }
    }
	
	/*public String toString() {
		return bottomCorner+topCorner+doorPosition;*/

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Room r = new Room();    // create room
//        Scanner x = new Scanner(System.in);
//        Scanner y = new Scanner(System.in);
//        System.out.println(r.isInRoom());
//

    }

}
