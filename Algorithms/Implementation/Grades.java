//https://github.com/Dzionek95/HackerRankSolutions

import java.util.Scanner;

class Grades{


    static int[] solve(int[] grades){
        int[] resultGrades=new int[grades.length];
        for(int i=0; i<grades.length; ++i ){
            if(grades[i]<38)
                resultGrades[i]=grades[i];
            else if((int)getNearsestFiveMultiplication(grades[i])-grades[i]<3){
                resultGrades[i]=(int)getNearsestFiveMultiplication(grades[i]);
            }
            else{
                resultGrades[i]=grades[i];
            }

        }
        return resultGrades;
    }

    static double getNearsestFiveMultiplication(double i){
        return Math.ceil(i/5)*5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();

        }
        solve(grades);
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != n - 1 ? " " : ""));
        }
        System.out.println("");


    }


}
