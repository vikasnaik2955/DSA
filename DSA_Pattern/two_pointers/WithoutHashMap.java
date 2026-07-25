package DSA_Pattern.two_pointers;

import java.util.Arrays;

public class WithoutHashMap {

    public static void main(String[] args) {

        int[] arr = {7,2,1,6,5};

        int target = 8;

        System.out.println("index of "+target+" "+ Arrays.toString(returnIndex(arr,target)));
    }

    public static int[] returnIndex(int[] arr, int target){
        int i=0 , j= arr.length-1;
        while(i<j){

            if(arr[i]+arr[j] == target)
                return new int[]{i, j};
            else if(arr[i]+arr[j]>target)
                j--;
            else{
                i++;
            }
        }

        return new int[] {-1,-1};
    }
}
