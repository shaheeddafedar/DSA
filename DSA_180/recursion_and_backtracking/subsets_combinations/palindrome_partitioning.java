package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    public static void main(String[] args) {
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        findpart(s,ans,0,new ArrayList<>());
        return ans;
    }
    public void findpart(String s, List<List<String>>ans,int start,List<String> list){
        if(start==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i =start;i<s.length();i++){
            String temp = s.substring(start, i + 1);
            if(isplaindrome(temp)){
                list.add(temp);
            findpart(s,ans,i+1,list);
            list.remove(list.size()-1);
            }
        }
    }
    public boolean isplaindrome(String s){
        String copy ="";
        for(int i = s.length()-1;i>=0;i--){
            copy+=s.charAt(i);
        }
        if(s.equals(copy)){
            return true;
        } 
        return false;
    }
}
// Time : O(n^2 * 2^n)
// Space : O(n * 2^n)