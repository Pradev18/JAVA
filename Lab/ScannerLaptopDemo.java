

import java.util.*;
import java.util.Scanner; //declared scanner package which is inbuilt

public class ScannerLaptopDemo { //created the class named as Scanner LaptopDemo with opening and closing block {}
static int operation; //declared a static varaible to store the operations which will be performed by the user

public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); //creation of scanner object that reads user input
         
		int result; //to show result
		int i; 
		int x;  //to take user input
		int y; //to take user input
		
		System.out.println("Hello! Welcome to Anudip Foundation");
		//options and some sentences will be displayed on the screen 
		do{
			
			System.out.println("Enter the number for the operations you want to perform:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Even/Odd \n5. Quit");
			System.out.println("Note: Please enter number only between 1-4, if you want to exit please press 5");
			operation = sc.nextInt(); //users input will be given over here
			System.out.println("Hey! you have chosen the option number: "+operation);
			switch(operation) 
			{
				case 1: //if the user gives 1 the addition will be performed
				System.out.println("Plz Enter first number: ");
				x = sc.nextInt();
				System.out.println("Plz Enter second number: ");
				y = sc.nextInt();
					result = x+y;
					System.out.println("The result is :"+result +"\n");
					break;

				case 2: //if the user gives 2 the subtraction will be performed
				System.out.println("Plz Enter first number: ");
				x = sc.nextInt();
				System.out.println("Plz Enter second number: ");
				y = sc.nextInt();
					result = x-y;
					System.out.println("The result is :"+result+"\n");
					break;

				case 3: //if the user gives 3 the multiplication will be performed
				System.out.println("Plz Enter first number: ");
				x = sc.nextInt();
				System.out.println("Plz Enter second number: ");
				y = sc.nextInt();
					result = x*y;
					System.out.println("The result is :"+result+"\n");
					break;

				case 4: //if the user gives 4 the even/odd  will be performed
				System.out.println("Plz Enter starting range: ");
				x = sc.nextInt();
				System.out.println("Plz Enter ending range: ");
				y = sc.nextInt();
					System.out.print("\nDisplay the even numbers between "+x+" and "+y+" are :");
					for(i=x;i<=y;i++){
						result=i%2;
						if(result==0)
						System.out.println(i);
					}
					System.out.print("\nDisplay the odd numbers between "+x+" and "+y+" are :");

					for(i=x; i<=y; i++){ 
						result=i%2; 
						if(result==1) 
						System.out.println(i);
						}
					break;

				case 5: //if the user gives 5 the operation gets quit
				System.out.println("Thankyou see you soon again...");
				break;
				
				default:
				//any invalid input gave by the user the following sentence will be displayed
					 System.out.println("Invalid input...");
			}
		}while(operation != 5); //continues until the user gives input as 5
		 			
		
    }
}