import java.util.*;
public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",120);
        lhm.put("US",50);
        System.out.println(lhm);
    }
}
