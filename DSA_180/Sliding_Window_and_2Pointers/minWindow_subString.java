package DSA_180.Sliding_Window_and_2Pointers;

public class minWindow_subString {
    public static void main(String[] args) {
        
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));

    }
  
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int min_Length = Integer.MAX_VALUE;
        int startindex = 0;
        int[] window = new int[128];
        int count = 0;

        int[] freq = new int[128];
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            window[ch]++;
            if (window[ch] <= freq[ch]) {
                count++;
            }
            while (count == t.length()) {
                int length = right - left + 1;
                if (length < min_Length) {
                    min_Length = length;
                    startindex = left;
                }
                char leftchar = s.charAt(left);
                window[leftchar]--;
                if (window[leftchar] < freq[leftchar]) {
                    count--;
                }
                left++;
            }
            right++;

        }
        if (min_Length == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startindex, startindex + min_Length);
    }
}
// Time: O(n + m)
//Space :O(1);

//Brute Force
//     public static String minWindow(String s, String t){
//         if (s.length() < t.length()) {
//             return "";
//         }
//         int min_Length = Integer.MAX_VALUE;
//         int startindex =0;
//         int [] freq = new int[128];
//         for (int i = 0; i < t.length(); i++) {
//             freq[t.charAt(i)]++;
//         }
//         for (int i = 0; i < s.length(); i++) {
//              int[] window = new int[128];
//             int count = 0;
//             for (int j = i; j < s.length(); j++) {
//                 char ch = s.charAt(j);
//                 window[ch]++;
//                 if (window[ch]<=freq[ch]) {
//                 count++;
//             }
//             if (count==t.length()) {
//                 int length= j-i+1;
//                 if (length<min_Length) {
//                     min_Length=length;
//                     startindex=i;
//                 }
//                 break;
//             }
//             }
//         }
//         if (min_Length == Integer.MAX_VALUE) {
//             return "";
//         }
//   return s.substring(startindex, startindex + min_Length);
//     }
    //Time : O(n^2);
    //Space :O(1);