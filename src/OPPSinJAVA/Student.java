package OPPSinJAVA;
import java.util.*;
public class Student {

        String name;
        int rno;
        double percent;

        public Student(String naam,int roll,double per){
            name=naam;
            rno=roll;
            percent=per;

        }

        public int getRno() { //getter
            return rno;
    }
    public void setRno(int roll){ //setter
           rno= roll;
    }
}

//theory
// STATIC FUNCTION
//used id we want to access a function in the class thought just Classname function
