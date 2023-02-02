/*4. Write a program to print an diamond star pattern using loop
    *
    *
   ***
   ***
   ***
    *
    *
*/


import java.util.Scanner;  
public class DiamondPattern  
{  
	public static void main(String args[])  
	{  
		int row, i, j, space = 1;  
		
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		row = sc.nextInt();  
		
		space = row - 1;  
		
		for (j = 1; j<= row; j++)   //outer loop rows //initialization //if the condition is satisfied then comes to loop if it is true
		{  
			for (i = 1; i<= space; i++)  //inner loop for col
			{  
				System.out.print(" ");  
			}  
			space--;  
			for (i = 1; i <= 2 * j - 1; i++)  
			{  
				System.out.print("*");  //then if the condition is satisfied using above loop then it will print *
			}  
			System.out.println("");  
		}  
		space = 1;  
		
		for (j = 1; j<= row - 1; j++)  //outer loop rows //initialization //if the condition is satisfied then comes to loop if it is true
		{  
			for (i = 1; i<= space; i++)  //inner loop for col
			{  
				System.out.print(" ");  
			}  
			space++;  
			for (i = 1; i<= 2 * (row - j) - 1; i++)  
			{  
				System.out.print("*");  //then if the condition is satisfied using above loop then it will print *
			}  
			System.out.println("");  
		}  
	}  
}  
