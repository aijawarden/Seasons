import java.util.Scanner;

public class Seasons
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner( System.in );

    int month;
    int day;
    String season= "seasons";


    System.out.print("type a temperature");
    temperature = in.nextInt();


    String winter = " winter ";
    String summer = " summer ";
    String spring = " spring ";
    String fall = " fall ";

    System.out.print(" Temperature="+ temperature);

    if (temperature <= 59)
    {
        //System.out.println(" Winter ");
        season = winter;
    }
    else if (temperature >= 75)
    {
        //System.out.println(" Spring ");
        season = spring;
    }
    else if (temperature >= 90)
    {
        //System.out.println(" Summer ");
        season = summer;
    }
    else if (temperature >= 74)
    {
        //System.out.println(" Fall");
        summer = fall;
    }


        if ( season.equals(winter) )  
            season = spring;
             //System.out.println(" Spring");

        else if ( season.equals(spring) ) 
            season = summer;
            //System.out.println ( "Summer" );

        else if ( season.equals(summer) ) 
            season = fall;
            //System.out.println ( " Fall");

        else if ( season.equals(winter) ) 
            season = winter;
            //System.out.println( " winter");

    System.out.println(season);
    }
}