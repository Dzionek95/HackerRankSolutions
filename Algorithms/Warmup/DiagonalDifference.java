import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/diagonal-difference

public class DiagonalDifference {

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int i=0;
        int j=0;
        int suma1=0;
        int suma2=0;
        while(i<a.length)
            suma1+=a[i++][j++];
        
        int p=a.length-1;
        i=0;
        while(p>=0)
            suma2+=a[i++][p--];
        
        System.out.println(Math.abs(suma1-suma2));
        
 }
}