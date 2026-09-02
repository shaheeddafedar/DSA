package Sorting.Sorting_2;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int [] arr ={5,1,4,3,6};
        int [] result = Recursive_Bubble(arr,0,arr.length-1);
        for (int i : result) {
            System.out.print(i + " ");
        }
        
    }
    public static int [] Recursive_Bubble(int [] arrs, int low,int high){
       if (high==0) {
        return arrs;
       }
      if (low<high) {
        if (arrs[low]>arrs[low+1]) {
            swap(arrs, low);
        }
                    Recursive_Bubble(arrs, low+1, high); 
      }else{
            Recursive_Bubble(arrs, 0, high-1);
        }
      return arrs;
    }
    public static void swap(int [] nums,int j){
        int temp = nums[j+1];
        nums[j+1]=nums[j];
        nums[j]=temp;
    }
}
