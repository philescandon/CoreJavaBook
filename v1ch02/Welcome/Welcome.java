/**
 * This program displays a greeting from the authors.
 * @version 1.20 2004-02-28
 * @author Cay Horstmann
 */
public class Welcome
{
   public static void main(String[] args)
   {
      String[] greeting = new String[4];
      greeting[0] = "Welcome to Core Java";
      greeting[1] = "by Cay Horstmann";
      greeting[2] = ",Gary Cornell";
      greeting[3] = "and Phil Escandon";
    for (String g : greeting)
         System.out.println(g);
   }
}
