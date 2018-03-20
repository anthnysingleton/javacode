public class Fibonacci2{
  
    public static final int TOTAL= (15-2);
  
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