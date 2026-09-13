package Array.Easy;

public class findMissingNumber {
    public static void main(String[] args) {
        int [] arrs= {0, 2, 3, 1, 4};
        int result =  missingNumber(arrs);
        System.out.println("The Missing Number is : "+result);
        
    }
    public  static  int missingNumber(int [] arrs){
        int xor = arrs.length;
        for (int i = 0; i < arrs.length; i++) {
            xor^=i;
            xor^=arrs[i];
        }
        return xor;
    }

    //    public  static  int missingNumber(int[] arrs) {
    //     int n = arrs.length;
    //     int actualsum=0;
    //     int expectedsum = n*(n+1)/2;
    //     for (int i = 0; i < arrs.length; i++) {
    //         actualsum+=arrs[i];; 
    //     }

    //     return expectedsum-actualsum;
    // }
}


// Time complexity O(n);
// Space complexity O(1);