package DSA_180.Sliding_Window_and_2Pointers.counting_windows;
import java.util.HashMap;

public class number_substring_contaning {
    public static void main(String[] args) {
    }
    public static  int numberOfSubstrings(String s) {
       int count =0;
       int l=0,r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                count+=s.length()-r;
                char leftchar = s.charAt(l);
                map.put(leftchar,map.get(leftchar)-1);
                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}

// Time:O(n)
//  Space:O(1) 


// Brute Force
// public int numberOfSubstrings(String s) {
//         int count =0;
//         for(int i =0;i<s.length();i++){
//            HashSet<Character> set = new HashSet<>();
//             for(int j =i;j<s.length();j++){
//                 char text = s.charAt(j);
//                 set.add(text);
//                if(set.contains('a')&&set.contains('b')&&set.contains('c')){
//                 count++;   or count+=(s.length()-1);
//                } 
//             }
//         }
//         return count;

//     }
    // Time:O(n^2)
    //  Space:O(1) 
