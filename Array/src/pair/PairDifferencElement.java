package pair;

import java.util.Arrays;

public class PairDifferencElement {



    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};
        int k = 2;

        System.out.println(Arrays.toString(returnPairInt(arr,k)));
    }

    static int[] returnPairInt(int[] arr, int k) {

        Arrays.sort(arr);

        int i = 0,j=arr.length-1;
        while (i<j){
            if((arr[j]-arr[i]) == k){
                return new int[]{arr[i],arr[j]};
            }else if((arr[j]-arr[i])>k){
                j--;
            }else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
