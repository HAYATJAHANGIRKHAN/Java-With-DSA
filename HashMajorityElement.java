import java.util.*;
public class HashMajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0; i<arr.length;i++){
//            if (map.containsKey(arr[i])){ /// apply 1
//                map.put(arr[i], map.get(arr[i]) +1);
//            }else {
//                map.put(arr[i],1);
//            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1); //apply 2 upper one and this line same code
        }
//        Set<Integer>keyset=map.keySet();//apply 1
//        for (Integer key: keyset){
        for (Integer key:map.keySet()){ // apply 2
            if (map.get(key)> arr.length/3){
                System.out.println(key);
            }
        }
    }
}
