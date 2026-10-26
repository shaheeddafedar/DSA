package DSA_180.Sliding_Window_and_2Pointers;

import java.util.HashMap;

public class kDistinctChar_313 {
    public static void main(String[] args) {
        
    }

     public static int kDistinctChar(String s, int k) {
    int n = s.length();
   int left=0;
   int right =0;
   int maxlen=-1;
   HashMap<Character,Integer>map = new HashMap<>();
   while (right<n) {
    char ch = s.charAt(right);
    map.put(ch, map.getOrDefault(ch, 0)+1);

    while (map.size()>k) {
        char chleft = s.charAt(left);
        map.put(chleft, map.get(chleft)-1);

        if (map.get(chleft)==0) {
            map.remove(chleft);
        }
        left++;
    }
    if (map.size()<=k) {
        maxlen=Math.max(maxlen, right-left+1);
    }
     right++; 
   }
  return  maxlen;
 }
}
//     Time :O(N);
//     Space :O(1)  

// Brute force
//     public int kDistinctChar(String s, int k) {
//         int n = s.length();
//         int maxlen = 0;

//         for (int i = 0; i < n; i++) {
//             HashMap<Character, Integer> map = new HashMap<>();

//             for (int j = i; j < n; j++) {
//                 char ch = s.charAt(j);

//                 map.put(ch, map.getOrDefault(ch, 0) + 1);

//                 if (map.size() <= k) {
//                     maxlen = Math.max(maxlen, j - i + 1);
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return maxlen;
//     }
//     Time :O(N^2);
//     Space :O(1)  