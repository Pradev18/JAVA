/*1. Write a program to design an Calculator using switch case*/

import java.util.*;
import java.util.Scanner; //import scanner class of util package

public class calculator {

    public void calc(int x, int y, int operation) { //declaring variable
        int result;
        switch (operation) {  //declaring variable for switch to test against the cases
            case 1:  //creating the cases
                result = x + y; 
                System.out.println(x + " + " + y + " = " + result);
                break;  //allows to complete the case
            case 2:
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                break;
            case 3:
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                break;
            case 4:
                result = x / y;
                System.out.println(x + " / " + y + " = " + result);
                break;
			case 5:
                result = x % y;
                System.out.println(x + " / " + y + " = " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creation of scanner object
        System.out.println("Enter the number for the operations you want to perform:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulas");
        int input = sc.nextInt(); 
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
		
		
        calculator sc_object = new calculator(); //construting the object while creating the class
        sc_object.calc(x, y, input);
        sc.close(); //closes the scanner
    }
}