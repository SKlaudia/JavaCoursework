package uk.ac.reading.klaudia.buidlingconsole;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author klaudia
 */
public class Building {

    private int xSize;
    private int ySize;
    private List<Room> allRooms;
    private static char[][] display;

    Building(String inputString) {
        setBuilding(inputString);

    }

    void setBuilding(String inputString) {
        allRooms = new ArrayList();

        String[] roomsAsString = inputString.split(";");
        this.xSize = Integer.parseInt(roomsAsString[0].split(" ")[0]);
        this.ySize = Integer.parseInt(roomsAsString[0].split(" ")[1]);

        for (int i = 1; i < roomsAsString.length; i++) {
            this.allRooms.add(new Room(roomsAsString[i]));

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

    public Room whichRoom(Person person) {
        for (Room room : allRooms) {
            if ((person.getX() > room.getTopLeftCorner().x) &&
                    (person.getX() < room.getBottomRightCorner().x) &&
                    (person.getY() < room.getTopLeftCorner().y) &&
                    (person.getY() > room.getBottomRightCorner().y)) {
                return room;
            }
        }
        return null;
    }

    public void doDisplay() {

        Person a = new Person();

        display = new char[ySize][xSize];

        Map<Point, String> wallsOfRooms = new HashMap<>();

        for (Room room : allRooms) {
            wallsOfRooms.putAll(room.showRoom());
        }

        //draw outline of building + person
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                if (x == a.getX() && y == a.getY()) {
                    display[y][x] = 'P';
                }

                if (wallsOfRooms.containsKey(new Point(x, y))) {
                    display[y][x] = wallsOfRooms.get(new Point(x, y)).charAt(0);
                }

                if (x == 0 || y == 0) {
                    display[y][x] = '#';
                }
                if (x == xSize - 1 || y == ySize - 1) {
                    display[y][x] = '#';
                }

            }
        }

        for (char[] aDisplay : display) {
            System.out.print(aDisplay);
            System.out.print("\n");

        }


        //Todo Ask user to select a user and then check whether they are in the room.
        System.out.println("");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Person a = new Person();
//Building b = new Building("11 11;0 0 5 5 3 5;6 0 10 10 6 6;0 5 5 10 2 5");
//System.out.println(b.toString() + "\n" +a.toString());
//doDisplay();

    }

}
