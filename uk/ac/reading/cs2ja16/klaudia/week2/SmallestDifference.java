/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.week2;

import javax.swing.JOptionPane;


/**
 * @author klaud
 *
 */
public class SmallestDifference {

	private int[] numbers;			// array of integers to analyse
	// you may want to add more private variables
	private int diff;
	private int lowestIndex;
	/**
	 * create class : 
	 * @param instr	- string with series of numbers separated by space
	 */
	SmallestDifference (String instr) {
		stringSplitter S = new stringSplitter (instr, " ");
		numbers = S.getIntegers();
	}
	/**
	 * method to search through array and find pairs of adjacent numbers
	 * which are closest in value; note the difference and where in array
	 */
	public void findSmallest() {
		double currentLowest = Double.POSITIVE_INFINITY;
	
		for (int i=0; i<numbers.length-1;i ++) {
			
			int numberOne = numbers[i];
			int numberTwo = numbers[i+1];
			diff = Math.abs(numberTwo-numberOne);
			if(diff<currentLowest) {
				currentLowest = diff;
				lowestIndex =i;
			}
			
		}
		diff=(int) currentLowest;
		
	}
		
    
	/**
	 * return as string the result of analysis
	 */
	public String toString() {
		return "Smallest difference is " + diff + "at index"+lowestIndex ;	// you extend this string
	}
	
	public static void main(String[] args) {
		String userIn = JOptionPane.showInputDialog(null, "Enter series of numbers separated by space > ");
		SmallestDifference sd = new SmallestDifference(userIn);
		sd.findSmallest();
		JOptionPane.showMessageDialog(null, sd.toString());

	}

}

