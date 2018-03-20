public class Classm{
  public static void main(String[] args){
    int squared = 0;
    for( int i =1;i <=5; i++){
      squared = i*i;
      System.out.println( i +"squared="+ squared);
    }
    System.out.println( "last square=" + squared);
  }
}