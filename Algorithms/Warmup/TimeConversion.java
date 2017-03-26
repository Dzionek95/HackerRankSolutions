import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/time-conversion

public class TimeConversion {

  public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      String time = scanner.next();
      if(time.equals("00:00:00AM"))
          System.out.println("24:00:00");
      if (time.startsWith("12") && time.endsWith("AM")) {
          System.out.println("00:" + time.substring(3, 8));
      }
     else if(time.startsWith("12") && time.endsWith("PM"))
          System.out.println("12:" + time.substring(3,8));
           
      else {
          if (time.endsWith("AM"))
              System.out.println(time.substring(0, 8));
          else {
              String temp = time.substring(0, 8);
              String[] tab = temp.split(":");

              int a = Integer.parseInt(tab[0]);
              a = a + 12;
              String fin = String.valueOf(a) + ":" + tab[1] + ":" + tab[2];
              System.out.println(fin);
          }}
  }
}