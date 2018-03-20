public class MostFrequent {
  public static void main(String[] args){
    int num=0;
    int[] freq= new int[args.length];
    for (int i=0; i<args.length; i++){
      try {
        num = Integer.parseInt(args[i]);
        freq[num]++;
      }
      catch (NumberFormatException nfe) {
      }
    }
    int max=9,p;
    for (p=1; p<args.length; p++){
      while(freq[p]>freq[max]){
        max=p;
      }
    }
    System.out.println("The digit that appears most frequently is " + max); 
  }
}