package DSA_180.BinarySearch.Search_on_answer;

public class NthRoot {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int result = NthRoots(n, m);
        System.out.println("Nth Root is: " + result);
    }
    public static int NthRoots(int n,int m){
        int low =1;
        int high=m;
        while (low<=high) {
            int mid=(low+high)/2;
            long power=1;
            for (int i = 1; i <=n; i++) {
                if (power > m) {
                    break;
                }
                power*=mid;
            }
            if (power==m) {
                return mid;
            }else if (power<m) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;
    }
}
// Time complexity: O(NlogM) 
// Space complexity: O(1),