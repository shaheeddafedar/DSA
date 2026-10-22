package DSA_180.Sliding_Window_and_2Pointers;

import java.util.HashMap;

public class longest_substring {
    public static void main(String[] args) {
    
    }
 public static  int longestNonRepeatingSubstring(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    int l=0,r=0,maxlen=0;
    while (r < s.length()) {
        char ch = s.charAt(r);
        if (map.containsKey(ch)) {
            if (map.get(ch) >= l) {
                l = map.get(ch) + 1;
            }
        }
        map.put(ch, r);
        maxlen = Math.max(maxlen, r - l + 1);
        r++;
    }
    return maxlen;
}
}
//Time :O(N);
//Space :O(N)  or Space Complexity: O(min(N, K))


// //BRUTE
// public int longestNonRepeatingSubstring(String s) {
//       int maxlen =0;
//       for(int i =0;i<s.length();i++){
//          HashSet<Character> set = new HashSet<>();
//          for(int j =i;j<s.length();j++){
//             char ch = s.charAt(j);
//             if(set.contains(ch)){
//                 break;
//             }
//              set.add(ch);
//             maxlen=Math.max(maxlen,j-i+1);
//          }
//       }
//       return maxlen;
//     }
//     Time :O(N^2);
//     Space :O(N)  or Space Complexity: O(min(N, K))