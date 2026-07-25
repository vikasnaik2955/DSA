package DSA_Pattern.two_pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {

    public static void main(String[] args) {

        int[] arr = {7,2,1,6,5};

        int target = 8;

        System.out.println("index of "+target+" "+ Arrays.toString(returnIndex(arr,target)));
    }

    public static int[] returnIndex(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(map.containsKey((target - arr[i]))){
                return new int[]{i,map.get(target - arr[i])};
            }
            map.put(arr[i],i);
        }
        return new int[]{};

    }
}
