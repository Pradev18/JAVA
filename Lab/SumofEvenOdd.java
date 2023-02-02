/* Write a program to print even, odd, sum of natural number using for loop from 1-200. */

import java.util.*;

public class SumofEvenOdd {

    public static void main(String[] args) {


        System.out.print("List of Even and Odd numbers and Sum of natural numbers \n");
		int number = 200;  //giving the range
		int sum=0; 
		
		System.out.println("The following number's are even:");
		for (int i=1; i<=number; i++)   //initialization, checks the num and if satisfied goes to if condition
		{
			sum = sum+i;
			 
			if(i % 2 == 0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\nThe following number's are odd: ");
		for (int i=1; i<=number; i++)   //same as above
		{
			if (i%2!=0) 
			{
				System.out.print(i+" ");
			}	 
			
			
		}
		System.out.println("\nSum of First 100 Natural Numbers is = " + sum); 

        
    }
}