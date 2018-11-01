/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.week2;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 * @author klaud
 *
 */
public class AnagramCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean areAnagrams=true;
		String word = JOptionPane.showInputDialog
				(null, "Enter two sentences seperated by a ';'");
		
		int firstSplit = word.indexOf(";");
		String one = word.substring(0, firstSplit);
		String two = word.substring(firstSplit+1, word.length() );
		
		char[] str1 = one.toLowerCase().toCharArray();
		char[] str2 = two.toLowerCase().toCharArray();
		
		Arrays.sort(str1);  
        Arrays.sort(str2);  
        areAnagrams = Arrays.equals(str1, str2);
		
		String oneSplit = one.replaceAll("\\s", "");
		oneSplit.toCharArray();
		String twoSplit = two.replaceAll("\\s", "");
		twoSplit.toCharArray();
		
		if(areAnagrams) {
			JOptionPane.showMessageDialog
			(null, "The sentences are anagrams");
		}else {
			JOptionPane.showMessageDialog
			(null, "The sentences are not anagrams");
		}
		
		
	}

}
