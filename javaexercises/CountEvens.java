/*
     * CS/IT 114    Spring 2013
     * Instructor:  Glenn Hoffman
     * 
     * Homework 8
     * 
     * Author:      Anthony Singleton
     * Program reads a file that only contains integers and counts the number of even integers in the file. 
     * The file name is numbers.txt. 
     */

import java.io.*;
import java.util.*;

public class CountEvens {
  public static void main(String[] args)
      throws FileNotFoundException {
    Scanner input = new Scanner(new File("numbers.txt"));
    int count = countEvens(input);
    System.out.println("The file contains " + count + " even integers.");
  }
  
  public static int countEvens(Scanner input) {
    int count = 0;
    while(input.hasNextInt()) {
      int number = input.nextInt();
      if(number % 2 == 0) {
        count++;
        }
    }
    return count; 
  }
}

