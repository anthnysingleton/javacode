/*
     * CS/IT 114    Spring 2013
     * Instructor:  Glenn Hoffman
     * 
     * Homework 5
     * 
     * Author:      Anthony Singleton
     * 
     * Prints first 15 Fibonacci Numbers
     */


public class Fibonacci{
  
    public static final int TOTAL= (15-2); // by using a Constant I eliminated the magic number 13
    
  public static void main (String[] args){
   
    System.out.println(0);
    System.out.println(1);
    int last= 1;
    int previous= 0;
    for(int i=1; i<=TOTAL; i++){
      int next = last + previous;
      System.out.println(next);
      previous=last;
      last=next;
    }
  }
    
}