import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotedArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int numLeftRotation = 2;

        System.out.println("After Rotating Arrays "+numLeftRotation+" times array is "+leftRotatedArray(numLeftRotation,list));


    }

    private static List<Integer> leftRotatedArray(int numLeftRotation, List<Integer> list) {

        int n = list.size();

        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i=0;i<n;i++){
            int newIndex = (i + (n - numLeftRotation))% n;
            result.set(newIndex,list.get(i));
        }


        return result;
    }
}
