public class DrawFigures2 {
  public static void main(String[] args){
    drawDiamond();
    drawX();
    drawRocket();
  }
  public static void drawDiamond(){
    drawCone();
    drawV();
    System.out.println();
  }
  public static void drawX(){
    drawV();
    drawCone();
    System.out.println();
  }
  public static void drawRocket(){
    drawCone();
    drawbox();
    System.out.println("|United|");
    System.out.println("|States|");
    drawbox();
    drawCone();
    System.out.println();
  }
  public static void drawbox(){
    System.out.println("+-----+");
    System.out.println("|     |");
    System.out.println("|     |");
    System.out.println("+-----+");
  }
  public static void drawCone(){
    System.out.println("  /\\");
    System.out.println(" /  \\");
    System.out.println("/    \\");
  }
  public static void drawV(){
    System.out.println("\\    /");
    System.out.println(" \\  /");
    System.out.println("  \\/");
  }
}