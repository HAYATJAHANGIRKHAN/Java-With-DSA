import java.util.*;
public class HashLargestSubarry {
    public static void main(String[] args) {
       int arr[]={15,-2,2,-8,1,7,10,23};
       HashMap<Integer,Integer>map= new HashMap<>();
       //(sum,idx)
        int sum=0;
        int len=0;
        for (int j=0; j<arr.length;j++){//0(n)
            sum+= arr[j];
            if (map.containsKey(sum)){
                len =Math.max(len, j-map.get(sum));
            }else {
                map.put(sum,j);
            }
        }
        System.out.println("largest subarray with sum as 0 =>"+len);



        // subarry sum  equal to k
        int arr1[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer>map1 =new HashMap<>();
        //(sum,count)
        map1.put(0,1);

        int sum1=0;
        int ans1=0;
        for (int j=0;j< arr1.length;j++){
            sum1 += arr1[j];//sum(j)
            if (map1.containsKey(sum1-k)){
                ans1+= map1.get(sum1-k);
            }
           map1.put(sum1, map1.getOrDefault(sum1,0)+1);
        }
        System.out.println(ans1);
    }
}
