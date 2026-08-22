package Sorting.Sorting_I;

public class bubble_Sort {
    public static void main(String[] args) {
        int [] arr ={13,24,52,20,9};
    }
        public static int[] bubbleSort(int[] nums) {
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j]<nums[i]) {
                        nums[j]=nums[i];
                    }
                    swap(nums, i, j);
                }
            }    
    }
    public static void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=nums[i];
    }
}
