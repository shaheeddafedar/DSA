package Pattern_Matching;

// (n-rows+1)
public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
      pattern5(n);
    }

    public static void pattern5(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



        // for (int i = 1; i <=n; i++) {
        //     for (int j = 0; j<n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }