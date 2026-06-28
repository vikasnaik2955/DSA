package DSA_Pattern;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class BruteForceImprove {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Start Time : "+startTime);

        findTarget(arr, target);

        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("End Time : "+duration);

    }

    public static boolean findTarget(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            if(map.containsKey(target-num)){
                return true;
            }
            map.put(num,1);
        }

        return false;
    }
}
