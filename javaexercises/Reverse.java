/* CS/IT 115 Summer 2013
 * Instructor: Dan Pletea
 * file: Average.java file for Hw0, exercise 4
 * After users enters all desired values the program will find the average
 */

import java.util.*;

public class Reverse{
  public static void main(String[] args){
    System.out.print("please enter your string: ");
    Scanner console = new Scanner(System.in);
    String s = console.nextLine();
    //reverse(s);
    System.out.println(reverse(s));
  }
    public static String reverse(String line){
    String location = "";
    for (int i =0; i < line.length(); i++){
      location = line.charAt(i) + location;
    }
    return location;
    }
  }
