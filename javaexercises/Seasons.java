import java.util.*;

public class Seasons{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the month");
    int month = console.nextInt();
    System.out.print("Please enter the day");
    int day = console.nextInt();
    String season = whichSeason(month,day);
    System.out.println(season);
  }
  
  public static String whichSeason(int month, int day){
    System.out.println("month: " + month + " day: " + day);
    if ( month==12 || month ==1 || month ==2){
      return "winter";
    }else if (month == 3){
      if (day < 16){
        return "winter";
      }else return "spring";
    }else if (month >= 3 && month <=6){
      return "spring";
    }else if (month == 6){
      if (day < 16){
        return "spring";
      }else return "summer";
    }else if (month >= 6 && month <=9){
      return "summer";
    }else if (month ==9){
      if (day < 16){
        return "summer";
      }else return "fall";
    }else if (month >= 9 && month <=12){
      return "fall";
    }else if (month ==12){
      if(day <16){
        return "fall";
      }else return "winter";
    }
    return "error";
  }
}