/**
 *
 */
package uk.ac.reading.klaudia.buidlingconsole;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author klaud
 */
public class Room_main {
    private Point topLeftCorner, bottomRightCorner, doorPosition;


    Room_main(String inputString) {
        String[] inputStringSplit = inputString.split(" ");
        topLeftCorner = new Point(Integer.parseInt(inputStringSplit[0]), Integer.parseInt(inputStringSplit[1]));
        bottomRightCorner = new Point(Integer.parseInt(inputStringSplit[2]), Integer.parseInt(inputStringSplit[3]));
        doorPosition = new Point(Integer.parseInt(inputStringSplit[4]), Integer.parseInt(inputStringSplit[5]));
    }

    public void isInRoom(int x, int y) {
        if (x > bottomRightCorner.x && x < topLeftCorner.x || y > topLeftCorner.y && y < bottomRightCorner.y) {
            System.out.println("Coordinates are in room");
        } else {
            System.out.println("Coordinates are not in room");
        }
    }

    public Map<Point, String> showRoom() {
        Map<Point, String> mapToReturn = new HashMap<>();
        for (int x = topLeftCorner.x; x <= bottomRightCorner.x; x++) {

            for (int y = bottomRightCorner.y; y >= topLeftCorner.y; y--) {


                if (y == bottomRightCorner.y || y == topLeftCorner.y) {
                    mapToReturn.put(new Point(x, y), "_");
                }
                if (x == topLeftCorner.x || x == bottomRightCorner.x) {
                    mapToReturn.put(new Point(x, y), "|");
                }
                if (x == doorPosition.x && y == doorPosition.y){
                    mapToReturn.put(new Point(x,y), " ");
                }

            }
        }
        return mapToReturn;
    }

    public String toString() {
        return "Top-Left corner " + topLeftCorner.x + "," + topLeftCorner.y +
                " Bottom-Right corner " + bottomRightCorner.x + "," + bottomRightCorner.y +
                " doorPosition " + doorPosition.x + "," + doorPosition.y +
                "\n";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Room_main room = new Room_main(System.console().readLine());

        Room_main room = new Room_main("0 0 5 5 0 2");
        System.out.println(room.toString());
        //room.isInRoom(Integer.parseInt(System.console().readLine()), Integer.parseInt(System.console().readLine()));
        room.isInRoom(7, 9);

    }


}
