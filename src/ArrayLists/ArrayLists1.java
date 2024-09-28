package ArrayLists;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
//        ArrayList<String> list1=new ArrayList<String>();
//        ArrayList<Boolean> list2=new ArrayList<Boolean>();
//        ArrayList<Float> list3=new ArrayList<Float>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements

        int element=list.get(0);
        System.out.println(element);

        int element1=list.get(1);
        System.out.println(element1);

        int element3=list.get(2);
        System.out.println(element3);


        // to add element in between

        list.add(1,25);
        System.out.println(list);

        //set element

        list.set(0,18);
        System.out.println(list);


        //delete element

        list.remove(3);
        System.out.println(list);


        // array size

        int size=list.size();
        System.out.println(size);

        // loops

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting--> optimizing

        Collections.sort(list);
        System.out.println(list);
        
    }
}
