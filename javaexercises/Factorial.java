/*
     * CS/IT 114    Spring 2013
     * Instructor:  Glenn Hoffman
     * 
     * Homework 6
     * 
     * Author:      Anthony Singleton
     * 
     * Prints factorials of number entered by user 
     */

import java.util.*;

public class Factorial{
  public static void main(String[] args){
    
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter a integer greater than or equal to zero");
    int num = console.nextInt();
    test(num);  // test the input entered and if its negative program is terminated and error sent to user
  }
  
  
  public static int factorial(int n){
    int fact =1;
    for(int i=1; i<=n;i++){
      fact *=i;
    }
    return fact;
  }
  
  public static int test(int n){
    if (n >=0){
      factorial(n);
      System.out.println("The factorial of " + n + " is " + factorial(n));
       return n;
    }else if (n<0){
      System.out.println("You cannot take the factorial of a negative number");
      return n;
    }
    return n;
  }
  
}