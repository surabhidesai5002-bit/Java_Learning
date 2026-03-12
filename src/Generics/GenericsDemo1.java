package Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //list.add("Hello");//cannot be added str

        list.add(10);
        list.add(20);
        list.add(30);

        //list.add(1.5);//cannot add double

       int x = list.get(2);
       /*not allowed bcuz this  gives an exception , so without generics we need to
       type caste (not type safety ) with generics type safety maintained*/

        System.out.println(list);
    }

}
