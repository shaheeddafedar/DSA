package DSA_180.Sliding_Window_and_2Pointers;

public class max_concetive_ones {
     public static void main(String[] args){
    }

    public int longestOnes(int[] arr, int k) {
        int r = 0, l = 0, maxlen = 0, countzero = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                countzero++;
            }
            while (countzero > k) {
                if (arr[l] == 0) {
                    countzero--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
// Time complexity: O(N)
// Space complexity: O(1)



// Brute
// public int longestOnes(int[] arr, int k) {
// int maxlen=0;
// for(int i=0;i<arr.length;i++){
// int countzero=0;
// for(int j=i;j<arr.length;j++){
// if(arr[j]==0){
// countzero++;
// }
// if(countzero<=k){
// maxlen= Math.max(maxlen,j-i+1);
// }else{
// break;
// }
// }
// }
// return maxlen;
// }
// Time O(N)
// Space O(1)