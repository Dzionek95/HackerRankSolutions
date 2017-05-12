import java.math.BigInteger;
import java.util.*;

/**
 * Created by Bartłomiej Janik on 5/9/2017.
 * https://www.hackerrank.com/challenges/big-sorting
 */
public class BigInt {

    public static void main(String ... args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<String> listBig=new ArrayList<>();
        for(int i=0; i<size;++i){
            listBig.add(sc.next());
        }

        sortList(listBig).forEach(System.out::println);


    }

    private static ArrayList<String> sortList(ArrayList<String> list) {
        list.sort((o1, o2) -> {
            if(o1.length()>o2.length())
                return 1;
            else if(o1.length()<o2.length())
                return -1;
            else{
                try {
                    int o1i = Integer.valueOf(o1);
                    int o2i = Integer.valueOf(o2);
                    if (o1i > o2i)
                        return 1;
                    else if (o1i < o2i)
                        return -1;
                    else
                        return 0;
                }
                catch (Exception e){
                    BigInteger o1b= new BigInteger(o1);
                    BigInteger o2b= new BigInteger(o2);
                    return o1b.compareTo(o2b);
                }
            }

        });

        return list;
    }


}
