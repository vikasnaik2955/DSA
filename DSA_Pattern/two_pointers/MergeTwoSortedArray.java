package DSA_Pattern.two_pointers;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] odd = {1,3,5}, even = {2,4,6};

        System.out.println(Arrays.toString(returnResult(odd, even)));
    }

    public static int[] returnResult(int[] odd, int[] even){

        int res[] = new int[odd.length+even.length];

        int i=0,j=0,n=0;

//        while (n<res.length){
//            if(i< odd.length && odd[i]<even[j]){
//                res[n] = odd[i];
//                i++;
//            }else if(j< even.length && odd[i]>even[j]){
//                res[n] = even[j];
//                j++;
//            }
//            n++;
//        }

        while (n < res.length && i< odd.length){
            if (odd[i]<even[j]){
                res[n++] = odd[i++];
            }else {
                res[n++] = even[j++];
            }
        }
        while (j<even.length){
            res[n++]=even[j++];
        }
        while (i< odd.length){
            res[n++]=odd[i++];
        }
        return res;
    }
}
