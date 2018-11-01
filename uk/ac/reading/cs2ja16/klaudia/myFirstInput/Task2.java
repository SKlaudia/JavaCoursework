/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.myFirstInput;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * @author klaud
 *
 */
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int freq =0;
		
		
		String word = JOptionPane.showInputDialog
				(null, "Input a word:");
		char[] c = word.toCharArray();
		
		for(int i = 0; i< c.length;i++) {
	        if(c[i]=='s')  // looking for 's' only
		freq++;}
	JOptionPane.showMessageDialog
				(null, "Number of 's': " + freq);

	}

}
