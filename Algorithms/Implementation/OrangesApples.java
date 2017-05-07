import java.util.Scanner;

public class OrangesApples{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beginHouse = in.nextInt();
        int endHouse = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        calculateIt(orange,apple,beginHouse,endHouse,appleTree,orangeTree);

    }

    private static void calculateIt(int[] orange, int[] apple, int beginHouse, int endHouse, int appleTree, int orangeTree) {
        int applesAmount=0;
        int orangesAmount=0;

        for(int i=0; i<apple.length;++i){
            if(appleTree+apple[i]>=beginHouse && appleTree+apple[i]<=endHouse)
                ++applesAmount;
        }

        for(int i=0; i<orange.length;++i){
            if(orangeTree+orange[i]>=beginHouse && orangeTree+orange[i]<=endHouse)
                ++orangesAmount;
        }

        System.out.println(applesAmount);
        System.out.print(orangesAmount);
    }
}