import java.util.HashSet;
import java.util.Iterator;

public class HashIteration {
    public static void main(String[] args) {
        HashSet<String> cities= new HashSet<>();
        cities.add("kashmir");
        cities.add("Baramulla");
        cities.add("pattan");
        cities.add("Tricolbal");
//        System.out.println(cities);
//        Iterator it = cities.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for (String city: cities){
            System.out.println(city);
        }
    }
}
