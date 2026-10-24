package DSA_180.Sliding_Window_and_2Pointers;

import java.util.HashMap;

public class longest_repating {
    public static void main(String[] args) {
        
    }
     public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0,right=0,maxfreq=0,maxlength=0;
         HashMap<Character,Integer> freq = new HashMap<>();
         while(right<n){
            char ch = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch, 0) + 1);
            maxfreq=Math.max(maxfreq,freq.get(ch));
            while((right-left+1)-maxfreq>k){
                char leftch = s.charAt(left);
                freq.put(leftch,freq.get(leftch) - 1);
                left++;
            }
            int windowlength = right-left+1;
         maxlength=Math.max(maxlength,windowlength);
            right++;
         }
             return maxlength;
 
    }
//     Time:O(n);
//     Space:O(1);
}

//brute force
// public int characterReplacement(String s, int k) {
//       int n = s.length();
//       int maxlength =0;
//       for(int i =0;i<n;i++){
//        HashMap<Character, Integer> freq = new HashMap<>();
//         int maxfreq=0;
//        for(int j =i;j<n;j++){
//         char ch = s.charAt(j);
//         freq.put(ch,freq.getOrDefault(ch, 0) + 1);
//         maxfreq=Math.max(maxfreq,freq.get(ch));
//         int windowlenght = j-i+1;
//         int changes = windowlenght-maxfreq;
//         if(changes<=k){
//             maxlength=Math.max(maxlength,windowlenght);
//         }
//        }
//       }
//       return maxlength;
//     }
//     Time:O(n^2);
//     Space:O(1);