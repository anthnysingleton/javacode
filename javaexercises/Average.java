/* CS/IT 115 Summer 2013
 * Instructor: Dan Pletea
 * file: Average.java file for Hw0, exercise 4
 * After users enters all desired values the program will find the average
 */

import java.util.*;

public class Average{
  public static void main(String[] args){
    System.out.println("How many values do u wish to enter:");
    Scanner console= new Scanner(System.in);
    int num = console.nextInt();
    System.out.println("Please enter your values:");
    double[] numbers = new double [num];
    double sum=0;
    
    for (int i=0; i < numbers.length; i++){
      numbers[i]=console.nextDouble();
      sum += numbers[i];
    }
    double average = (double) sum/numbers.length;
    System.out.println("The average of th numbers entered is:" + average);
  }
}