/* CS/IT 115 Summer 2013
 * Instructor: Dan Pletea
 * file: Divisors.java file for Hw0, exercise 3
 * Prints all the positive divisors of the input given to command line
 * if negative or zero error message will print
 */

import java.util.*;
  
public class Divisors{
  public static void main(String[] args){
    System.out.print("Please enter a integer:");
    Scanner console= new Scanner(System.in);
    int x = console.nextInt();
    divisors(x);
  }
  public static int divisors(int x){
    if (x <= 0){
      System.out.println("Invalid value");
    }else {
      for(int i = 1; i <= x; i++){
        int j= x%i;
        if (j==0){
          System.out.print(i + " ");
        }
      }
    }
    return x;
  }
}