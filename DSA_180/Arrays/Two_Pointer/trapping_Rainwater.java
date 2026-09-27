package DSA_180.Arrays.Two_Pointer;

public class trapping_Rainwater {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trap(arr);
        System.out.println("The Total Water  is : " + result);
        
    }
        public static  int trap(int[] height) {
       int totalwater =0;
       for (int i = 0; i < height.length; i++) {
        int leftmax =0;
        for (int j = 0; j <=i; j++) {
            leftmax=Math.max(leftmax, height[j]);
        }
        int rigthmax =0;
        for (int j2 = i; j2 <height.length; j2++) {
             rigthmax=Math.max(rigthmax, height[j2]);
        }
         int water =Math.min(leftmax, rigthmax)-height[i];
         totalwater+=water;
       }
       return totalwater;
    }
}
