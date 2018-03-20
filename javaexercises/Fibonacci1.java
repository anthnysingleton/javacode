import java.util.*;

public class Fibonacci1{
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    
    System.out.print("Up to what Fibonacci number do you want: ");
    int total = console.nextInt();
   
    System.out.println(0);
    System.out.println(1);
    int last= 1;
    int previous= 0;
    for(int i=1; i<= (total-2); i++){
      int next = last + previous;
      System.out.println(next);
      previous=last;
      last=next;
    }
  }
    
}