package DSA_180.Sliding_Window_and_2Pointers;

public class minWindow_subString {
    public static void main(String[] args) {
        
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));

    }
    public static String minWindow(String s, String t){
        if (s.length() < t.length()) {
            return "";
        }
        int min_Length = Integer.MAX_VALUE;
        int startindex =0;
        int [] freq = new int[128];
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
             int[] window = new int[128];
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                window[ch]++;
                if (window[ch]<=freq[ch]) {
                count++;
            }
            if (count==t.length()) {
                int length= j-i+1;
                if (length<min_Length) {
                    min_Length=length;
                    startindex=i;
                }
                break;
            }
            }
        }
        if (min_Length == Integer.MAX_VALUE) {
            return "";
        }
  return s.substring(startindex, startindex + min_Length);
    }
}
