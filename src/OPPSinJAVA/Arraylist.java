package OPPSinJAVA;

import java.util.Arrays;

public class Arraylist {

    public static class arraylist{
        int arr[]= new int[2];
        int idx=0;
        int size=0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr= Arrays.copyOf(arr,arr.length*2);
//                arr=new int[brr.length];
//                arr=Arrays.copyOf(brr,brr.length);

                arr=brr;

            }
            arr[idx]=ele;
            idx++;
            size++;
        }
        public void set(int idx,int val){
            arr[idx]=val;
        }

    }
    public static void main(String[] args) {
        arraylist arr = new arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);

    }

}










/*
* array mai agar size se zyada variable ho jaye to vo dusra array banayega double size ka
*
* eg. size=4
* arr=1,2,3,4
* double wala array
* double arr=1,2,3,4, , , , ,
*
  */