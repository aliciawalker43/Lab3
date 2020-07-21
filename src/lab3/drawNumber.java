package lab3;

import java.util.Scanner;

public class drawNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scnr = new Scanner(System.in);
       
       
       
       System.out.println(" Pick a number 1-100. ");
       int userInput = scnr.nextInt();
       
       if ((userInput % 2 == 1) && (userInput <60)) {
    	   System.out.println (" The number is odd.");
      }else if((userInput % 2 ==1) && (userInput > 60)){
     	  System.out.print("Your number is " + userInput + " and it is odd.");
      } else if ((userInput % 2 ==0) && (userInput < 25)) {
		System.out.println (" Even and less than 25.");
	  } else if ((userInput % 2 ==0) && (userInput >= 26) && (userInput <= 60 )) {
		  System.out.println ("Even.");
      }else if ((userInput % 2 ==0) && (userInput > 60)){
    	  System.out.println( "Your number is " + userInput + " and it is even."); 
      }
 }
}