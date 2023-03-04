import java.util.ArrayList;
import java.util.Scanner;

public class function {




    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
         list.add(3);
         list.add(11);
         list.add(9);
        System.out.println(list);
        for (int i= list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
     }
    }


