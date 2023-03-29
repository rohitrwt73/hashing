import java.util.HashMap;
public class hashmap_basics {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm= new HashMap<>();
        //insert --> O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",500);
        hm.put("India",120);//value will be updated to 200 from 100
        System.out.println(hm);
       //get --> O(1)
       System.out.println(hm.get("India"));  //120
       System.out.println(hm.get("Bhutan"));  //null
       //containsKey --> O(1)
       System.out.println(hm.containsKey("India"));   // true
       System.out.println(hm.containsKey("Bhutan"));   //false
       //remove   -->O(1)
       System.out.println(hm.remove("China"));  //150
       System.out.println(hm); 
       //size
       System.out.println(hm.size());   //2
        //isEmpty
        System.out.println(hm.isEmpty());  //false
        //clear
        hm.clear();   //empties whole map
        System.out.println(hm.isEmpty());  //true

    }
    
}
