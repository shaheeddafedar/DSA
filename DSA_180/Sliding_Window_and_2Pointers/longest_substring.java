package DSA_180.Sliding_Window_and_2Pointers;

public class longest_substring {
    public static void main(String[] args) {
    
    }

     
}

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