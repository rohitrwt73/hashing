import java.util.*;
public class iteration {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm= new HashMap<>();
        //insert --> O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",500);
        hm.put("Indonesia",120);
        hm.put("Nepal",5);
        System.out.println(hm);
        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
       for (String k : keys) {     //foreach loop on keyset
        System.out.println("key="+k+",value="+hm.get(k));
       }
    }
    
}
