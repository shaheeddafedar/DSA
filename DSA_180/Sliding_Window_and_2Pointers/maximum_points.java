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