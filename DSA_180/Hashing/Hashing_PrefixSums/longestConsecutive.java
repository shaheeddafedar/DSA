package DSA_180.Hashing.Hashing_PrefixSums;

public class longestConsecutive {
    public static void main(String[] args) {
    int [] arr = {100, 4, 200, 1, 3, 2};
    int result = longestConsecutives(arr);
    System.out.println("Result is : "+result);
    }

        public static  int longestConsecutives(int[] nums) {
           int  maxcount=0;
           for (int i = 0; i < nums.length; i++) {
            int x =nums[i];
            int count=1;
            while (search(nums,x+1)) {
                x++;
                count++;
            }
             maxcount = Math.max(maxcount, count);
           }
           return maxcount;
        }
        public  static  boolean search(int [] arr, int targert){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==targert) {
                    return  true;
                }
            }
            return false;

        }
}
