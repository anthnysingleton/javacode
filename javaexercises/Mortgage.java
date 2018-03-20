// this program prompts for information about a loan and 
// computes the monthly mortage payment

import java.util.*; // for scanner

public class Mortgage{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    
    // obtains values
    System.out.println("this program computes monthly " + "mortgage payments.");
    System.out.print("Loan amount   : ");
    double loan = console.nextDouble();
    System.out.print("number of years : ");
    int years = console.nextInt();
    System.out.print("Interest rate : ");
    double rate= console.nextDouble();
    System.out.println();
    
    // compute the result and report 
    int n = 12 * years;
    double c = rate / 12.0 / 100.0;
    double payment = loan * c * Math.pow(1+ c, n) / (Math.pow(1+c, n) - 1);
    System.out.println("payment = $" + (int) payment);
  }
}