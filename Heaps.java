import javax.xml.namespace.QName;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Heaps {
    static class Student implements Comparable<Student>{
    String name;
    int rank;
    public Student(String name, int rank){
        this.name= name;
        this.rank=rank;
    }
    @Override
        public int compareTo(Student s2){
        return this.rank - s2.rank;
    }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq =new PriorityQueue<>();
        pq.add(new Student("hayat", 4));
        pq.add(new Student("jaana", 5));
        pq.add(new Student("jahangir", 2));
        pq.add(new Student("khan",12));
        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + "->"+ pq.peek().rank);//0(1)
            pq.remove();//o(logn)
        }

    }
}

