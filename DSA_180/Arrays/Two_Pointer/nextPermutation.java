package DSA_180.Arrays.Two_Pointer;


public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3 };
        nextPermutations(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
        public static void nextPermutations(int[] arrs) {
            int pivot =-1;
            for (int i = arrs.length-2; i >= 0; i--) {
                if (arrs[i]<arrs[i+1]) {
                    pivot=i;
                    break;
                }
            }
            if (pivot==-1) {
                reverser(arrs,  0, arrs.length - 1);
                return;
            }
            for (int i = arrs.length-1; i > pivot; i--) {
                if (arrs[i]>arrs[pivot]) {
                    swap(arrs, i,pivot);
                    break;   
                }
            }
            reverser(arrs, pivot + 1, arrs.length - 1);

        }
        public  static  void  swap(int []arr,int i, int j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public  static void  reverser(int []arr, int left,int right){
            while (left<right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
}

// Time	O(n)
// Space	O(1)