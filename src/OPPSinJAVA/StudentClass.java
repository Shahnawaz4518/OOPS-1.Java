package OPPSinJAVA;
import java.util.*;
public class StudentClass {
   /* public static class Student {

        String name;
        private int rno;
        double percent;

    }

        public static void fun(Student x){
            System.out.println(x.name);
            return;
        }
        public static void change(Student s){
            s.name="Khan";
        }
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name="shahnawaz";
            s1.rno=76;
            s1.percent=92.5;
//            System.out.println(s1.name);
//            change(s1);
//            System.out.println(s1.name);
            //System.out.println(s1.getRno());
           // s1.setRno(76);
        }
    }*/

public static void change(Student s){
    s.name="Khan";
}
    public static void main(String [] args){
        Student s1=new Student("Shahnawaz",76,94.3);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }
}


