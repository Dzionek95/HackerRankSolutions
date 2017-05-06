
import java.util.Scanner;

// https://www.hackerrank.com/challenges/sansa-and-xor
public class SansaXOR {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tests=sc.nextInt();
        ArrayList<Integer> list=null;
        for(int i=0; i< tests ; ++i){
            list = new ArrayList<>();
            int length=sc.nextInt();
            for(int j=0; j<length;++j){
                list.add(sc.nextInt());
            }
            System.out.println(checkXOR(list));
        }


    }

    public static int checkXOR(ArrayList<Integer> list) {
        int value=0;
        int size=list.size();
        int listEnd=size;
        if(size%2==0)
            return 0;
        else {
            for (int j = 0; j < size; j+=2) {
                value ^= list.get(j);
            }

        }

        return value;
    }


}