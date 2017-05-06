import java.util.Scanner;

//https://www.hackerrank.com/challenges/birthday-cake-candles

public class Candles{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        long candlesBlown=0;
        for(int i=0; i<age; ++i){
            list.add(in.nextInt());
        }
        long maxValue=list.stream()
                .reduce(Integer::max)
                .get();

        candlesBlown= list.stream()
                .filter(n -> n==maxValue)
                .count();

        System.out.println(candlesBlown);
    }
}