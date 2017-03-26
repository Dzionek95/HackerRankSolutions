import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

https://www.hackerrank.com/challenges/plus-minus

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        printFraction(arr);
    }
  
  public static void printFraction(int[] a){
        int counter1=0;
        int counter2=0;
        int counter3=0;
                
        for(int s:a){
            if(s==0)
                counter1++;
            if(s<0)
                counter2++;
            if(s>0)
                counter3++;
                       
        }
        
        double odpowiedz1= (double)counter3/a.length;
        double odpowiedz0= (double)counter1/a.length;        
        double odpowiedz2= (double)counter2/a.length;
        
      System.out.printf("%.6f%n", odpowiedz1); 
      System.out.printf("%.6f%n", odpowiedz2);
      System.out.printf("%.6f%n", odpowiedz0);
  }
}