import java.util.ArrayList;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/breaking-best-and-worst-records

public class main {

    static void getMariasRecords(ArrayList<Integer> list){
        int max=list.get(0);
        int maxCounter=0;
        int min=list.get(0);
        int minCounter=0;
        for(int i=1; i<list.size();++i){
            int value=list.get(i);
            if(max>value){
                max=value;
                maxCounter++;
            }
            if(min<value){
                min=value;
                minCounter++;
            }
        }

        System.out.println(maxCounter+ " " + minCounter);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int s_i=0; s_i < n; s_i++){
            list.add(in.nextInt());
        }

        getMariasRecords(list);

    }


}
