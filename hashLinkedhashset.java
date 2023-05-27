import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashLinkedhashset {
    public static void main(String[] args) {
        HashSet<String> cities= new HashSet<>();
        cities.add("kashmir");
        cities.add("Baramulla");
        cities.add("pattan");
        cities.add("Tricolbal");
        System.out.println(cities);

        LinkedHashSet<String>lhs= new LinkedHashSet<>();
        lhs.add("kashmir");
        lhs.add("Baramulla");
        lhs.add("pattan");
        lhs.add("Tricolbal");
        System.out.println(lhs);

        TreeSet<String>ths=new TreeSet<>();
        ths.add("kashmir");
        ths.add("Baramulla");
        ths.add("pattan");
        ths.add("Tricolbal");
        System.out.println(ths);

        //count distinct elements

        int num[]={4,3,2,5,6,7,3,4,2,1 };
        HashSet<Integer>set= new HashSet<>();
        for (int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println("ans ="+ set.size());
    }
}
