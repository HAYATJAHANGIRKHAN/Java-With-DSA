import java.util.*;
public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
        lhm.put("kashmir", 100);
        lhm.put("Baramulla", 111);
        lhm.put("pattan", 70);
        lhm.put("Tricolbal", 10);
        System.out.println(lhm);

        HashMap<String,Integer>hm= new HashMap<>();
        hm.put("kashmir", 100);
        hm.put("Baramulla", 111);
        hm.put("pattan", 70);
        hm.put("Tricolbal", 10);
        System.out.println(hm);


        TreeMap<String,Integer>thm= new TreeMap<>();
        thm.put("kashmir", 100);
        thm.put("Baramulla", 111);
        thm.put("pattan", 70);
        thm.put("Tricolbal", 10);
        System.out.println(thm);
        hm = new HashMap<>();
        hm.put("kashmir", 100);
        hm.put("Baramulla", 111);
        hm.put("pattan", 70);
        hm.put("Tricolbal", 10);
        System.out.println(hm);


    }
}
