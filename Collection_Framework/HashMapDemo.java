package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){

        HashMap<Integer,String> map =new HashMap<>();

        map.put(101,"Nitin");
        map.put(102,"Rahul");
        map.put(103,"Aman");

        System.out.println(map);

        System.out.println(map.get(102));

        map.replace(103,"Mohit");

        System.out.println(map);

        System.out.println(map.containsKey(101));

        System.out.println(map.containsValue("Rahul"));

        System.out.println(map.size());

        for(Integer key:map.keySet()){

            System.out.println(key);

        }

        for(String value:map.values()){

            System.out.println(value);

        }

        for(Map.Entry<Integer,String> e:map.entrySet()){

            System.out.println(e.getKey()+" "+e.getValue());

        }

        map.remove(102);

        System.out.println(map);

        map.clear();

        System.out.println(map);

        }

}

