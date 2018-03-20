/* CS/IT 115 Summer 2013
* Instructor: Dan Pletea
* file: Search.java file for Hw0, exercise 6
* After users enters all desired values the program will find the average
*/
 
 
public class Search{
  public static void main(String[] args){
    int x = Integer.parseInt( args[0] );
    int[] sequence = { 2,3,4,10,-11,25,31,-21, 14, 18, 131, 99, 721, 23, 44, 802, 820, -603, 102, 53, 64, -912, 1201, 3001 };
    search (sequence , x);
  }
  public static void search(int [] sequence, int x){
    for (int i=0; i<= sequence.length; i++){
      if (sequence[i] == x){
        System.out.print("found it");
      }else{
        System.out.print("not found");
      }
       
    }
 }
}