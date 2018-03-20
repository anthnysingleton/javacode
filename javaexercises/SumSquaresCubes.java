// IT 114 Spring 2013
// Instructor Glenn Hoffman

//Homework 4
// Author: Anthony Singleton

// Prints SumSquaresCubes

public class SumSquaresCubes {
      public static void main(String[ ]  args) {
        int totalSquares =  sumSquares(10);
        System.out.println("The sum of the squares from 1 to 10 is " + totalSquares);
        System.out.println();
        int totalCubes =  sumCubes(10);
        System.out.println("The sum of the cubes from 1 to 10 is " + totalCubes);
    }

      // produces the sum of squares
      public static int sumSquares(int n) {
        int sum = 0;
        for (int i = 1; i<= n; i++) {
          sum= sum + (i*i);
        }
        return sum;
      }
      
      // produces the sum of cubes
      public static int sumCubes(int n) {
        int sum = 0;
        for (int i = 1; i<= n; i++) {
          sum= sum + (i*i*i);
        }
        return sum;
      }

}
