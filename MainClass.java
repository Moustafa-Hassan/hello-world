package myPackage;

import java.security.SecureRandom;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass
{

	private enum UNIRange {
		IS_0_32, IS_48_57, IS_65_90, IS_97_122, IS_127_160, VALID
	};

	public static void main(String[] args)
	{
		
		
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int n = input.nextInt();
		System.out.print("Enter a number between 1 and 20: ");
		int o = input.nextInt();
		System.out.printf("Multiplication :%,d\nAddition : %d", n * o,n + o);

//		GregorianCalendar gregorianCalendar = new GregorianCalendar(2009, 3, 4);
//
//		char[] upperCase = new char[26 ];
//		
//		for (int i = 0; i < upperCase.length; i++)
//		{

//			upperCase[i] = (char)(i + 65);
//		}//for 
//		
//		char[] lowerCase = new char[26];
//		
//		for (int i = 0; i < lowerCase.length; i++)
//		{
//			lowerCase[i] = (char)(i + 97);       
//		}//for
//		
//		int[] numbers = new int[200];
//		
//		for (int i = 0; i < numbers.length; i++)
//		{
//			numbers[i] = i;
//		}//for
//		
//		char[] symbols = new char[127];
//		int unicodeValue = 0;// for the  unicode value till 256 
//		int arrayIndexValue = 0; // for the array index value only 127
//		for (int loopControlVariable = 0; loopControlVariable < 256; loopControlVariable++)// till 256
//		{
//			UNIRange state;
//			
//			if (loopControlVariable >= 0 && loopControlVariable <= 32)
//			{
//				state = UNIRange.IS_0_32;
//			} else if (loopControlVariable >= 48 && loopControlVariable <= 57)
//			{
//				state = UNIRange.IS_48_57;
//			} else if (loopControlVariable >= 65 && loopControlVariable <= 90)
//			{
//				state = UNIRange.IS_65_90;
//			} else if (loopControlVariable >= 97 && loopControlVariable <= 122)
//			{
//				state = UNIRange.IS_97_122;
//			} else if (loopControlVariable >= 127 && loopControlVariable <= 160)
//			{
//				state = UNIRange.IS_127_160;
//			} else
//			{
//				state = UNIRange.VALID;
//			}// end if else 
//			
//			if (state == UNIRange.VALID)
//			{
//				symbols[arrayIndexValue] = (char)(unicodeValue);
//				arrayIndexValue++;
//			}// end if
//			
//			unicodeValue++ ; // always increments     
//			
//		}// end for
//
//		String[] shuffled = shuffle(upperCase, lowerCase, numbers, symbols);
//
//		printArray(shuffled);

	}// end main()/

//	// Random Shuffling method that takes multiple arrays.
//	// content of elements.
//	private static String[] shuffle(char[] upperCase, char[] lowerCase, int[] numbers, char[] symbols)
//	{
//
//		String[] names = new String[new SecureRandom().nextInt(200)];
//
//		for (int i = 0; i < names.length; i++)
//			// returns a single array of random no of elements, length of elements and
//		{
//			int lengthOfTheName = new SecureRandom().nextInt(100);
//			StringBuilder name = new StringBuilder(lengthOfTheName);
//			for (int j = 0; j <= lengthOfTheName; j++)
//			{
//				int switcher = new SecureRandom().nextInt(4);// returns 4 numbers 0 - 3
//				if (switcher == 0)
//				{
//					name.append(upperCase[new SecureRandom().nextInt(26)]);
//				} else if (switcher == 1)
//				{
//					name.append(lowerCase[new SecureRandom().nextInt(26)]);
//				} else if (switcher == 2)
//				{
//					name.append(numbers[new SecureRandom().nextInt(200)]);
//				} else
//				{
//					name.append(symbols[new SecureRandom().nextInt(127)]);
//				} // if else
//
//			} // for
//
//			names[i] = name.toString();
//		} // for
//
//		return names;
//
//	}// End shuffle
//
//	// Array printing method that takes an object array and prints it on screen
//	private static void printArray(Object[] array)
//	{
//
//		for (int i = 0; i < array.length; i++)
//		{
//			System.out.printf("( %d: %s )", i, array[i]);
//			System.out.println();
//		}
//	}// End print array.
//
//	// Recursion test method that takes an integer and returns a factorial of it
//	// recursively.
//	private static long factorial(int n)
//	{
//		if (n == 1)
//			return 1;
//		else
//			return n * factorial(n - 1);
//	}// End factorial.
}// End of the class main class.
