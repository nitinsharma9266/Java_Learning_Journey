package Collection_Framework;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list =
                new ArrayList<>();

        // add
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        // get
        System.out.println(list.get(1));

        // set
        list.set(2,"Kotlin");

        System.out.println(list);

        // contains
        System.out.println(list.contains("Java"));

        // size
        System.out.println(list.size());

        // add(index)
        list.add(1,"HTML");

        System.out.println(list);

        // remove(index)
        list.remove(0);

        System.out.println(list);

        // remove(object)
        list.remove("Python");

        System.out.println(list);

        // indexOf
        System.out.println(list.indexOf("HTML"));

        // isEmpty
        System.out.println(list.isEmpty());

        // for-each
        for(String s:list){

            System.out.println(s);

        }

        // clone
        //ArrayList<String> copy =(ArrayList<String>) list.clone();

        //System.out.println(copy);

        // toArray
        Object arr[] = list.toArray();

        for(Object x:arr){

            System.out.println(x);

        }

        // clear
        list.clear();

        System.out.println(list);

    }

}