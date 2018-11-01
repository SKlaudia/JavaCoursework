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
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = JOptionPane.showInputDialog
				(null, "Enter your full name:");
		
		int firstSpace = word.indexOf(" ");
		int lastSpace = word.lastIndexOf(" ");
		
        String firstName = word.substring(0, firstSpace);
        String middleName = word.substring(firstSpace + 1 , lastSpace);
        String lastName = word.substring(lastSpace + 1, word.length());
		
        String first = firstName.substring(0, 1);
        String middle = middleName.substring(0, 1);
        String last = lastName.substring(0, 1);
        
        
        
		JOptionPane.showMessageDialog
		(null, "Your initials are: " +first+middle+last);
	}

}
