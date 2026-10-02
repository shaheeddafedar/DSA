package DSA_180.BinarySearch.Binary_Search;

public class findPeakElement {
    public static void main(String[] args) {
        
    }
        public static  int findPeakElements(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if ((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1])) {
                    return arr[i];
                }
            }
            return -1;
    }
}
