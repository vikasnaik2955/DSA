import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {

    public static void maxSumSubArray(int[] arr){

        int maxSofar = arr[0], currentSum = arr[0];

        int start = 0,end = 0, s = 0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>currentSum+arr[i]){
                currentSum = arr[i];
                s = i;
            }else {
                currentSum += arr[i];
            }

            if (currentSum>maxSofar){
                maxSofar = currentSum;
                start = s;
                end = i;
            }
        }
        System.out.println("Maximum Subarray Sum : "+maxSofar);
        System.out.println("SubArray : ");
        for (int i=start;i<=end;i++){
            System.out.print(i+" ");
        }


    }

//    public static void maxSumSubArray2(int[] arr){
//
//        List<Integer> list = List
//
//        int maxSum = arr.stream
//    }
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//        maxSumSubArray(arr);
    }
}
