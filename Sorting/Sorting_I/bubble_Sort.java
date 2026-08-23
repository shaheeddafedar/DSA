package Sorting.Sorting_I;

public class bubble_Sort {
    public static void main(String[] args) {
        int [] arr ={13,24,52,20,9};
        int []result = bubbleSort(arr);
      for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
      }
    }
        public static int[] bubbleSort(int[] nums) {
            for (int i = 0; i < nums.length-1; i++) {
              for (int j = 0; j < nums.length-i-1; j++) {
            if (nums[j] > nums[j + 1]) {
                swap(nums, j);
            }
        }
            }    
            return nums; 
    }
    public static void swap(int []nums,int i){
        int temp = nums[i+1];
        nums[i+1]=nums[i];
        nums[i]=temp;
    }
}
