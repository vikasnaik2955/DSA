package sorts.searching;

public class SearchingInsertionNumber {

    public static int findIndex(int[] nums, int target){

        int left = 0, right = nums.length-1, i = 0;

        while (left <= right){
            i = left + (right - left) / 2;

            if(nums[i] == target){
                return i;
            }else if(nums[i] < target){
                left = i + 1;
            }else {
                right = i - 1;
            }
        }

        return left;
    }
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(findIndex(nums, target));
    }
}
