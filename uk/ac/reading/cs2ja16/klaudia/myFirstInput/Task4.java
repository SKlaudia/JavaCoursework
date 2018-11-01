/**
 * 
 */
package uk.ac.reading.cs2ja16.klaudia.myFirstInput;

/**
 * @author klaud
 *
 */
public class Task4 {

	static int countNames (String names) { 
		/*int count = 0;
        if (!(" ".equals(names.substring(0, 1))) || !(" ".equals(names.substring(names.length() - 1))))
        {
            for (int i = 0; i < names.length(); i++)
            {
                if (names.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;*/
		
		int a=0; 
		String nameSplit[]=names.split(" ");
		a=nameSplit.length;
		return a;
	} 

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPeople = countNames("klaudia james amy kate");
		
	
		System.out.println("Number of names is " + numPeople);

		
	}

}
