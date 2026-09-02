package Sorting.Sorting_2;
public class Quick_Sort {
    public static void main(String[] args) {
           int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
           int result []= Quick_Sorting(arr, 0, arr.length - 1);
        for (int num : result) { 
            System.out.print(num + " ");
        }
        
    }
    public static int [] Quick_Sorting(int [] nums,int low,int high){
        if (low<high) {
            int pivotIndex = partion(nums,low,high);
            Quick_Sorting(nums,low,pivotIndex-1);
            Quick_Sorting(nums,pivotIndex+1,high);
        }
        return nums;
    }
    public static int partion(int []nums,int low,int high){
        int pivot=nums[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (nums[j]<=pivot) {
                i++;
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
            nums[i+1]=nums[high];
            nums[high]=temp;
        return i+1;
    }
}
