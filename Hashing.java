import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        //create
   HashMap<String,Integer> hm =new HashMap<>();
   //insert -0(1)
        hm.put("kashmir",111);
        hm.put("baramulla",101);
        hm.put("pattan",50);
        hm.put("Tricolbal",11);
        System.out.println(hm);
        //get -0(1)
       int population= hm.get("Tricolbal");
        System.out.println("population="+population);
        //containskey -0(1)  output true/false key exist or not
        System.out.println(hm.containsKey("pattan"));//true
        System.out.println(hm.containsKey("India"));//false
        //remove -0(1)
        System.out.println(hm.remove("pattan"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());
//        hm.clear();
//        System.out.println(hm.isEmpty());

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for ( String k:keys) {
            System.out.println("key="+ k+ ", value="+hm.get(k));
            
        }
    }
}
