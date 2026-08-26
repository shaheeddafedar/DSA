package Sorting.Sorting_I;

public class insertion_Sort {
    public static void main(String[] args) {
        
        int[] nums = { 5, 4, 3, 2, 1 };
        System.out.println("Insertion Sort using Ascending  Order");
        int [] result1=insertion_Sort_Asc(nums);
        for (int i = 0; i < result1.length; i++) {
        System.out.println(result1[i]);
        }
                System.out.println("Insertion Sort using Descending  Order");
        int[] result2 = insertion_Sort_Dec(nums);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }

    public static int[] insertion_Sort_Asc(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                swap(nums, j);
                j--;
            }
        }
        return nums;
    }

    public static int[] insertion_Sort_Dec(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] > nums[j - 1]) {
                swap(nums, j);
                j--;
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
    }
}
