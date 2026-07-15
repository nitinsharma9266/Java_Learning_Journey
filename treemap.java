// import java.util.HashMap;
import java.util.Hashtable;
//import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.TreeMap;



public class treemap {

    public static void main(String[] args) {
        // Map<String,Integer> map=new TreeMap<>();
        // Map<String,Integer> map=new HashMap<>();
        // Map<String,Integer> map=new LinkedHashMap<>();
        Map<String,Integer> map=new Hashtable<>();
        map.put("second",2);
        map.put("first",1);
        map.put("fourth",4);
        map.put("third",3);
        System.out.println("Map using Treemap :" +map);
        map.replace("first", 11);
        map.replace("third",33);
        System.out.println("New Map :"+map);
        int rval=map.remove("first");
        System.out.println("The removed value is :"+rval);

    }
}