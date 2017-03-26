import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;

//https://www.hackerrank.com/challenges/compare-the-triplets

public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista1=new ArrayList<>();
        ArrayList<Integer> lista2=new ArrayList<>();
                
        for(int i=0; i<3; ++i){
            lista1.add(in.nextInt());
        }
        for(int k=0; k<3; ++k){
            lista2.add(in.nextInt());
        }
        int a=0;
        int b=0;
        for(int j=0; j<3;++j){
            if(lista1.get(j)>lista2.get(j))
                a++;
                if(lista1.get(j)<lista2.get(j))
                    b++;
                
            
        }
            System.out.print(a + " "+ b);
    }
}