/*
Name: CountUp
Purpose: Reads in a number and counts up from 1 to that number.
Author: Joe Smoe
Date: 2019-10-30
*/

import java.io.*;

public class CountUp
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbInp = new BufferedReader (new InputStreamReader (System.in));

	// Read in a number
	System.err.print ("Enter a positive integer: ");
	int number = Integer.parseInt (kbInp.readLine ());

	// Error Checking
	if (number < 1)
	{
	    System.err.println ("You must enter a positive integer.");
	}

	// Print out numbers from 1 to the input number
	for (int count = 1; count <= number; count++);
	    ;
	{
	    System.out.println (count);
	}
    }
}

