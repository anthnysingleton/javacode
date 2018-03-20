// IT 114 Spring 2013
// Instructor Glenn Hoffman

//Homework 3
// Author: Anthony Singleton

// Prints Squares & Cubes of numbers 1-10

public class SquaresCubes{
  public static void main(String[] args){
    printSquares();
    System.out.println();
    printCubes();
  }
  
  
  // Takes the number 1-10 and multiplies it by itself inorder to give the square
  
  public static void printSquares(){
    for(int numSquared = 1; numSquared <= 10; numSquared++){
      System.out.println(numSquared +" squared = " + (numSquared * numSquared));
    }
    System.out.println( );
  }
  

  // Takes the numbers 1-10 and multiplies it by itself twice inorder to give the cube
  
  public static void printCubes(){
    for(int numCubed =1; numCubed <=10; numCubed++){
      System.out.println(numCubed +" Cubed = "+ (numCubed * numCubed * numCubed));
    }
  }
}
