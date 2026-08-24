package Sorting.Sorting_I;

public class selection_Sort {
    public static void main(String[] args) {
        int [] arr={13,46,24,52,20,9};

        System.out.println("Selection Sort using Ascending  Order");
        int [] result1 = selectionSort_Asc(arr);
        for (int i = 0; i < result1.length; i++) {
            System.out.println(+result1[i]);
        }
                System.out.println("Selction Sort using Descending  Order");
          int [] result2 = selectionSort_Des(arr);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(+result2[i]);
        }
        
    }

    public static int[] selectionSort_Asc(int[] nums) {

        for (int i = 0; i <nums.length-1; i++) {
            int mini =i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[mini]) {
                mini=j;
                }
            }
            swap(nums, mini,i);
        }
        return nums;
    }

        public static int[] selectionSort_Des(int[] nums) {

        for (int i = 0; i <nums.length-1; i++) {
            int mini =i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]>nums[mini]) {
                mini=j;
                }
            }
            swap(nums, mini,i);
        }
        return nums;
    }

    public static void swap( int arr[],int mini,int i){
        int temp = arr[mini];
        arr[mini]=arr[i];
        arr[i]=temp;
    } 
}



// Time Complexity = O(N²)
// Space Complexity = O(1)