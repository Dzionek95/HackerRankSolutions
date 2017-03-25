package test;

import java.io.*;
import java.util.*;


// https://www.hackerrank.com/challenges/mini-max-sum

public class MinMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> lista=new ArrayList<>();
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long add=0;
        long sum=0;
        for(int i=0; i<5; ++i){
             add=in.nextLong();
             sum+=add;
             lista.add(add);
        }
        long temp=sum;
        for(int i=0; i<5; ++i){
            sum-=lista.get(i);
            if(sum>max)
                max=sum;
            if(min>sum)
                min=sum;

            sum=temp;
        }
        System.out.print(max + " " + min);
    }


}



