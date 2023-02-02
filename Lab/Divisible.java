/*2. Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.*/

import java.util.*;
 
public class Divisible{
    	public static void main(String args[]) {
					
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<=100; i++) { //initializing, giving the range and doing postinrement also 
			if (i%5==0 && i>40) { //it checks whether the numb is divided by 5 and whether it is greater than 40 or not
				
				System.out.print(i +" ");
			}
				
		}
		
				
		System.out.println("\n");
  }
}