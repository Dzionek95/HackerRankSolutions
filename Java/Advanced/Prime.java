import static java.lang.System.in;
import java.util.ArrayList;
class Prime {

    public static void checkPrime(int... a) {
        int wynik = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        for (int liczba : a) {

            int sqrtA = (int) Math.sqrt(liczba);
            int counter = 0;
            for (int i = 2; i <= sqrtA; i++) {
                if (liczba % i == 0) {
                    counter++;
                }

            }
            if (counter == 0 && liczba != 1) {
                lista.add(liczba);
            }



        }
        for (int k : lista) {
            System.out.print(k);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
