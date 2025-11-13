import java.util.Arrays;

public class MaxStringLength {

    public static void maxStrArray(String[] arr){

        int count = 0;

        String maxSubArray = "";

        for (String str : arr){
            if(count<str.length()){
                count = str.length();
                maxSubArray = str;
            }
        }

        System.out.println("Max String in Array :"+maxSubArray);
    }
    public static void main(String[] args) {
        String[] arr = {"pavan","ruturaj","abhishek","rahul","manoj"};

        System.out.println(Arrays.toString(arr));

        maxStrArray(arr);
    }
}
