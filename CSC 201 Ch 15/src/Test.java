import java.io.*;

public class Test{
   public static void main(String args[]){
      String Str = new String("Welcome-to-Tutorialspoint.com");

      System.out.println("Return Value :" );
      Str.split("\\s");
         System.out.println(Str);
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-", 3)){
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-", 0)){
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("-")){
         System.out.println(retval);
      }
   }
}