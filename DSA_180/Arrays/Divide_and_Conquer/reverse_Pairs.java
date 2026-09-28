package DSA_180.Arrays.Divide_and_Conquer;

public class reverse_Pairs {
    public static void main(String[] args) {
        
    }
     public static int reversePairs(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>2*arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
