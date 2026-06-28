package DSA_Pattern;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class BruteForce {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int target = 5;

        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Start Time : "+startTime);
        boolean ans = findTarget(arr, target);

        System.out.println(Arrays.toString(arr)+" in this Array pair of element sum of "+target+" is Present: "+ans);
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("End Time : "+duration);
    }

    private static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+ arr[j] == target){
                    return true;
                }
            }

        }
        return false;
    }
}
