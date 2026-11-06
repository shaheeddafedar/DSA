package DSA_180.Sliding_Window_and_2Pointers;

public class maximum_points {
    public static void main(String[] args) {
         int[] cardScore = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int result = maxScore(cardScore, k);
        System.out.println("Maximum Points: " + result);
        
    }
     public static  int maxScore(int[] cardScore, int k) {
       int leftsum =0,rightsum=0,maxsum=0;
       for (int i = 0; i <k; i++) {
        leftsum+=cardScore[i];
        maxsum=leftsum;
       } 
       int rightindex = cardScore.length-1;
       for (int i = k-1; i >=0; i--) {
          leftsum-=cardScore[i];
          rightsum=cardScore[rightindex];
          rightindex--;
          maxsum=Math.max(maxsum, leftsum+rightsum);
       }
       return maxsum;
    }
}
// Time :O(2*k);
// Space :=O(1);



// Brute Force
// public static int maxScoreBruteForce(int[] cardScore, int k) {
//     int n = cardScore.length;
//     int maxsum=0;
//     for (int left = 0; left <= k; left++) {
//         int sum = 0;
//          for (int i = 0; i < left; i++) {
//             sum += cardScore[i];
//         }
//         for (int right = 0; right <k-left; right++) {
//             sum+=cardScore[n-1-right];
//         }
//         maxsum=Math.max(maxsum,sum);
//     }
//     return maxsum;

// }

// Time Complexity: O(k²)
// Space Complexity: O(1).