import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;


class Test{

    public void display(double volume){

        System.out.printf("%.3f\n",volume);
    }

}
class Calculate{



    Test output = new Test();

    Scanner sc=new Scanner(System.in);

    public int get_int_val() throws NumberFormatException,IOException {
        int a = sc.nextInt();
        if(a<=0)
            throw new NumberFormatException("All the values must be positive");
        return a;
    }

    public double get_double_val(){
        double a = sc.nextDouble();
        if(a<=0)
            throw new NumberFormatException("All the values must be positive");
        return a;
    }

    public static Calculate do_calc() {
        return new Calculate();
    }

    public double get_volume(int a) {
        return a * a * a;
    }

    public double get_volume(int l, int b, int h) {
        return l * b * h;
    }

    public double get_volume(double r) {
        double wynik=Math.PI*Math.pow(r,3);
        return (wynik*2)/3;
    }

    public double get_volume(double r, double h) {
        return Math.PI * r * r * h;
    }

}

public class CalculatingVolume {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T--> 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {}

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
} //end of Do_Not_Terminate