import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-priority-queue/submissions/code/40479883

public class PriorityQueue {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = in.nextInt();
        StudentCompare cmp=new StudentCompare();
        PriorityQueue<Student> queue=new PriorityQueue<>(1001,cmp);


        while(totalEvents>0) {
            String event = in.next();

                if (event.equals("SERVED")) {
                    if(queue.size()>0){
                        queue.remove();
                    }
                } else {
                    String name = in.next();
                    double avrg = in.nextDouble();
                    int index = in.nextInt();
                    Student student = new Student(index, name, avrg);
                    queue.add(student);


            }

            totalEvents--;
        }
        if(queue.size()>0) {
            while (queue.size() != 0) {
                System.out.println(queue.remove().getFname());
            }
        }
        else
            System.out.println("EMPTY");


    }



}

class StudentCompare implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getCgpa()<o2.getCgpa())
            return 1;
        else if(o1.getCgpa()>o2.getCgpa())
            return -1;
        else {
            int cmpName=o1.getFname().compareTo(o2.getFname());
            if(cmpName!=0)
                return cmpName;
            else{
                if(o1.getToken()<o2.getToken())
                    return 1;
                else if(o1.getToken()>o2.getToken())
                    return -1;
                else
                    return 0;
            }

        }



    }
}

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}