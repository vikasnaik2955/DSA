package DSA_Pattern.two_pointers;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3,4};

        System.out.println("Return unique element count: "+returnUniqueElementCount(arr));

    }

    public static int returnUniqueElementCount(int[] arr){

        int c=0,i=1;

        while(i<arr.length){
            if(arr[i]==arr[i-1]){
                i++;
            }else{
                arr[c+1] = arr[i];
                c++;
                i++;
            }
        }

        return c+1;
    }
}
