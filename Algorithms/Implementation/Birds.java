import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int size=sc.nextInt();
        for(int i=0; i<size; ++i){
            list.add(sc.nextInt());
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=1; i<=5; ++i){
            map.put(i,0);
        }

        for(int i=0; i<list.size();++i){
            int key= list.get(i);
            int value=map.get(key);
            map.put(key,++value);
        }

        int maxValue=0;
        int maxIndex=0;
        for(int i=1; i<=5; ++i){
            if(maxValue<map.get(i)){
                maxValue=map.get(i);
                maxIndex=i;
            }
        }
        System.out.println(maxIndex);
    }


}
