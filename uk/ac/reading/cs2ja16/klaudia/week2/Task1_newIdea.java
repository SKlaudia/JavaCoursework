/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.week2;

/**
 * @author klaud
 *
 */
public class Task1_newIdea {

	/**
	 * @param args
	 */
	private int maxNum;				// up to maxNum*maxNum
	private int[][] TableData;			// 2D array to store these
	
	/**
	 * create table for 1*1 up to maxN*maxN
	 * @param maxN
	 */
	Task1_newIdea (int maxN) {	
		// create array of right size, then call makeTable to fill it
		int [][] tableSize = new int [10][10];
		
	}
	/**
	 * function to populate the table
	 */
	public static void makeTable() {
// write code to populate the table (hint nested for loops)
		
		for (int i = 1; i <=10; i++) {
			String table=" ";
			for(int j = 1; j<=10; j++) {
				table+= i*j + "\t";
				
			}
			System.out.println(table);
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
