package pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static pair.PairDifferencElement.returnPairInt;

public class HashMapPair {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};
        int k = 2;

        System.out.println(Arrays.toString(returnPairInt1(arr,k)));
    }

    private static int[] returnPairInt1(int[] arr, int k) {

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-k)){
                return new int[]{map.get(arr[i]-k),i};
            }

            if(map.containsKey(arr[i]+k)){
                return new int[]{map.get(arr[i]+k),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
