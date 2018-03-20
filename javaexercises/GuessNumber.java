/*
     * CS/IT 114    Spring 2013
     * Instructor:  Glenn Hoffman
     * 
     * Homework 7
     * 
     * Author:      Anthony Singleton
     * Creates random number for user to guess
     * once user guesses correctly prints the number of times taken to guess correctly
     */
import java.util.*;

public class GuessNumber{
  public static void main(String[] args){
    Scanner cons = new Scanner(System.in);
    String prompt = "Please enter a number between 1 and 10";
    guess(cons, prompt);
  }
  //  guess() creates random number and then compares it to the user input number while counts the number of tries to guess correctly
  // it then will print the the number of times it takes user to guess correctly.
   public static int guess(Scanner cons, String prompt){
    Random r = new Random();
    int input = r.nextInt(11);
      
    int m = getInt(cons, prompt);
    int count=0;
    count++; 
    
    while (m != input){
      m = getInt(cons, prompt);
      count ++ ;
    }
    System.out.println("It took you " + count + " times to guess correcty ");
    return count;
  }
  
 // getInt() takes input entered by user and makes sure it is a interger and not a double or char
 // it then returns value if it is true back to guess to run in its method
 // if test is failed user will get a error message.
  public static int getInt(Scanner cons, String prompt){
    System.out.print(prompt);
    if(! cons.hasNextInt()){
      String input = cons.next(); // the input is no good. read it in to get rid of it
      System.out.println(input + " is not an integer");
      System.out.print(prompt);
    }else{
    return cons.nextInt();
  }
  return cons.nextInt();
} 
}