
import java.util.ArrayList;
import java.util.Scanner;


public class Testy {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        int counter=0;
        Scanner sc=new Scanner(System.in);
        int ile=sc.nextInt();
        int podzielna=sc.nextInt();
        for(int i=0; i<ile;++i){
            lista.add(sc.nextInt());
        }
        for(int k=0; k<lista.size(); ++k){
            for(int j=k+1; j<lista.size(); ++j){
                if((lista.get(k)+lista.get(j))%podzielna==0){

                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}




