package Sorting.Sorting_2;


public class Quick_Sort_Dec {
    public static void main(String[] args) {
        int [] arrs ={1,2,3,4,5,8,7,10,9};
        int [] result = Quick_Sort_Decc(arrs,0,arrs.length-1);
        for (int i : result) {
            System.out.println(i+" ");
        }
        
    }
    public static int [] Quick_Sort_Decc(int [] arr,int low, int high){
        if (low<high) {
            int pivot_element = partion(arr,low,high);
            Quick_Sort_Decc(arr,low,pivot_element-1);
            Quick_Sort_Decc(arr,pivot_element+1,high);
        }
        return arr;
    }
    public static int partion(int [] arr,int low ,int high){
       int pivot = arr[high];
      int i = low-1;
      for (int j = low; j < high; j++) {
        if (arr[j]>pivot) {
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
      int temp=arr[i+1];
      arr[i+1]=arr[high];
      arr[high]=temp;
    return i+1;

    }
}
