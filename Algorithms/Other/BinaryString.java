import java.util.Scanner;

//https://www.hackerrank.com/contests/w32/challenges/duplication

class BinaryString{

    static String getNextString(char c){
        return (c=='0')? "1":"0";
    }

    static char duplication(int k){
        String s="0";
        String s2="";
        while(s.length()<1000) {
            for (int j = 0; j < s.length(); ++j) {
                s2 = s2 + getNextString(s.charAt(j));
            }
            s = s + s2;
            s2 = "";
        }
        return s.charAt(k);

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            char result = duplication(x);
            System.out.println(result);
        }
    }


}