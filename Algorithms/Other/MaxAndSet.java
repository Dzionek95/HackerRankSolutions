import java.util.ArrayList;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-bitwise-and

class main{



    public static int findMaxAnd(int setSize, int maxValue){
        int[] arr=new int[setSize];
        int max=-100;
        for(int i=0;i<arr.length;++i){
            arr[i]=i+1;
        }
        int a,b=0;
        for(int i=0; i<arr.length; ++i){
            a=arr[i];
            for(int j=i+1; j<arr.length;++j){
                b=arr[j];
                if((a&b)>max && (a&b)<maxValue)
                    max=a&b;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(findMaxAnd(n,k));
        }


    }
}




