package Array.Easy;

public class ConsecutiveOnes {
    public static void main(String[] args) {
              int [] arrs= {1, 1, 0, 0, 1, 1, 1, 0};
        int result =  findMaxConsecutiveOnes(arrs);
        System.out.println("The Maximum Consecutive Ones : "+result);
        
    }
      public static  int findMaxConsecutiveOnes(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1&&arr[i+1]==1) {
              count++;
            }
        }
        return count;
    }
}
