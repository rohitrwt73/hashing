import java.util.*;
public class iterationSet {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
         cities.add("Delhi");
         cities.add("Mumbai");
         cities.add("Chennai");
         cities.add("Noida");
         cities.add("bengalore");
         Iterator it= cities.iterator();  //first method of iteration--using Iterator
         while(it.hasNext())
         System.out.println(it.next());
        
        for(String city:cities){        //second method of iteration--using foreach loop
            System.out.println(city);
        }

    }
}