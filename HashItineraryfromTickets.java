import java.util.*;

public class HashItineraryfromTickets {
    public static String getStartingPoint(HashMap<String,String> tickets){
        HashMap<String,String> revMap= new HashMap<>();
        for (String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for (String key : tickets.keySet()){
            if (!revMap.containsKey(key)){
                return key;// starting point
            }
        }
        return null;
    }


    public static void main(String[] args) { //0(n)
        HashMap<String,String> tickets= new HashMap<>();
         tickets.put("ch","ban");
        tickets.put("mumbai","Delhi");
        tickets.put("Goa","ch");
        tickets.put("Delhi","goa");
        String start= getStartingPoint(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
