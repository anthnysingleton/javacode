public class BusSong{
  public static void main(String[] args){
    verse("wheels", "go", "round and around");
    verse("wipers", "go", "swish, swish, swish");
    verse("horn", "go", "beep, beep, beep");
  }
  
  public static void verse(String item, String verb, String sound){
    System.out.println("The " + item + " on the bus " + verb + " " + sound + ",");
    System.out.println(sound + ",");
    System.out.println(sound + ".");
    System.out.println("The " + item + " on the bus " + verb + " " + sound + ",");
    System.out.println("All through the town.");
    System.out.println();
  }
}