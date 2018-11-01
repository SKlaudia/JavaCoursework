/**
 *
 */
package uk.ac.reading.klaudia.buidlingconsole;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author klaud
 */
public class BuildingInterface {

    private String printBuilding;
    char[][] print; // draws the interface
    Scanner s;            // scanner used for input from user
    String displayBuilding;
    Building myBuilding;    // building in which rooms are shown
    static char[][] display;
    static Building building;

    /**
     * return as String definition of bOpt'th building
     *
     * @param bOpt
     */
    public String buildingString(int bOpt) {
        if (bOpt == 1)
            return "11 11;0 0 5 5 3 5;6 0 10 10 6 6;0 5 5 10 2 5";
        else
            return "40 12;0 0 15 4 8 4;15 0 30 4 22 4;0 6 10 11 6 6";
    }


    /**
     * constructor for BuildingInterface
     * sets up scanner used for input and the arena
     * then has main loop allowing user to enter commands
     */
    public BuildingInterface() {
        s = new Scanner(System.in);    // set up scanner for user input
        int bno = 1;            // initially building 1 selected

        myBuilding = new Building(buildingString(bno));// create building

        char ch = ' ';
        do {
            System.out.print("(N)ew buidling (I)nfo, (D)raw, e(X)it > ");
            ch = s.next().charAt(0);
            s.nextLine();
            switch (ch) {
                case 'N':
                case 'n':
                    bno = 3 - bno;  // change 1 to 2 or 2 to 1
                    myBuilding.setBuilding(buildingString(bno));
                    break;
                case 'd':
                    myBuilding.doDisplay();
                    break;
                case 'I':
                case 'i':
                    System.out.print(myBuilding.toString());
                    break;
                //case 'd': System.out.println(myBuilding.doDisplay()); // create a doDisplay method
                case 'x':
                    ch = 'X';    // when X detected program ends
                    break;

            }
        } while (ch != 'X');            // test if end

        s.close();                    // close scanner
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BuildingInterface b = new BuildingInterface();
        // just call the interface
        //doDisplay();
//System.out.println(Arrays.toString(display));
    }

}
