package com.jenkins.ci;

import java.util.Scanner;

public class GeneratePrimeNumbers {
	
	private static Scanner s;

	public static boolean isPrime(int n){
		//Check if a number is not divisible by any number other than 1 and itself
		for(int i=2; i<n; i++){
          if(n%i == 0){
              return false; //number is not prime
          }
		}
		//Return true if number is prime
		return true; 
   }
	
   public static void main(String args[]) {
	   //get input - an integer
	   System.out.println("Please input an integer number between 1 and 50: ");
	   s = new Scanner(System.in);
	   int maxInt = s.nextInt();
      
	   //printing all primer numbers inside the max number
	   System.out.println("Printing prime numbers up to " + maxInt);
	   for(int number = 2; number<=maxInt; number++){
		   //print prime numbers only
		   if(isPrime(number)){
			   System.out.println(number);
		   }
	   }
   }

}
