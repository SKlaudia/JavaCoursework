/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.week2;

/**
 * @author klaud
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	private int maxNum;				// up to maxNum*maxNum
	private int[][] TableData;			// 2D array to store these
	
	/**
	 * create table for 1*1 up to maxN*maxN
	 * @param maxN
	 */
	Task1 (int maxN) {	
		// create array of right size, then call makeTable to fill it
	}
	/**
	 * function to populate the table
	 */
	public static void makeTable() {
// write code to populate the table (hint nested for loops)
		
		for (int i = 1; i <=10; i++) {
			int one=i*1;
			System.out.println(one);
		}
		for (int a =1; a<=10; a++) {
			int two= a*2;
			System.out.println(two);
		}
		
	}
	/**
	 * return string with the table
	 */
	public String toString() {
	String res = "RJMs Multiplication Table"+"\n";	// title for string
		// write code to add data from 2D array to res
		return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeTable();
	}

}
