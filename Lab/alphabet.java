/*5. Write a program to print Left down alphabet triangle pattern using loop
ABCDE
ABCD
ABC
AB
A*/



import java.io.*;
public class alphabet
{
public static void main(String[] args) {
    int size = 5;
    int alpha = 65;

    for (int i = 0; i < size; i++) { //outer loop rows //initialization //if the condition is satisfied then comes to loop if it is true
      // printing alphabets
	   
      for (int j = 0; j < size - i; j++) { //inner loop
		  System.out.print(" ");
		  System.out.print((char)(alpha+j)); //then if the condition is satisfied using above loop then it will print *
      }
      System.out.println();
    }
  }
}