package duongLab24;
import java.lang.NumberFormatException; // import NumberFormatException class
import java.util.Scanner; // import Scanner class
public class Duongbin2Dec // class declaration
{
	public static void main(String[]args) // main method
	{
		Duongbin2Dec test1 = new Duongbin2Dec(); // new Duongbin2Dec object
		Scanner input = new Scanner(System.in); // new Scanner object which takes input from the user
		try { // try...
			System.out.println("Please enter a binary number: "); // prompts user for a binary number
			String binary = input.nextLine().replaceAll(" ", ""); // stores the user input in a String without spaces
			System.out.println("The binary number in decimal notation is: " + test1.bin2Dec(binary)); // prints out the decimal notation of the binary number using the bin2Dec() method
			input.close(); // close input
		}
		catch(NumberFormatException nfe) // catches NumberFormatException
		{
			System.out.println("The input entered was not in proper binary format!"); // prints statement
		}
	}
/*
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * bin2Dec method which takes a String parameter and returns an int; can throw a NumberFormatException
 * traverses the binary String and checks the numerical value of each char in the String
 * if a char is not equal to 0 or 1 (not a binary String), the program throws a NumberFormatException 
 * otherwise, the program calculates the respective decimal value of the specific binary digit and adds it to a running total
 * returns the running total (integer(
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	public int bin2Dec(String binaryString) throws NumberFormatException
	{
		int exponent = 0; int integer = 0;
		for(int i = binaryString.length() - 1; i >= 0; i--)
		{
			if(Character.getNumericValue(binaryString.charAt(i)) != 0 && Character.getNumericValue(binaryString.charAt(i)) != 1)
			{
				throw new NumberFormatException();
			}
			else
			{
				integer += Character.getNumericValue(binaryString.charAt(i)) * Math.pow(2,  exponent);
				exponent++;
			}
		}
		return(integer);
	}
}
