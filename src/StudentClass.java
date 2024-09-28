/*public  class studentClass {

    //creating a new data type
    public static  class Student {
        String name;
        int rno;
        double percent;

    }


    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="shahnawaz";
        s1.rno=76;
        s1.percent=92.5;


        Student s2=new Student();
        s2.name="Akshit";
        s2.percent=98.4;
        s2.rno=45;
        System.out.println(s1.percent+2.5);
    }
}*/


/*public  class studentClass {

    //creating a new data type
  


    public static void main(String[] args) {
          class Student {
            String name;
            int rno;
            double percent;

        }

        Student s1 = new Student();
        s1.name="shahnawaz";
        s1.rno=76;
        s1.percent=92.5;


        Student s2=new Student();
        s2.name="Akshit";
        s2.percent=98.4;
        s2.rno=45;
        System.out.println(s1.percent+2.5);
    }
}*/



/*public  class studentClass {
    public static class  Student {
        String name;
        int rno;
        double percent;
    }
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="shahnawaz";
        s1.rno=76;
        s1.percent=92.5;
        System.out.println(s1.name);

        //update
        s1.name="Khan";
        System.out.println(s1.name);
        //fun(s1);

    }
}*/

public  class StudentClass {
    public static class  Student {
        String name;
        int rno;
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
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);





    }
}