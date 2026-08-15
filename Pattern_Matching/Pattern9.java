package Pattern_Matching;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
      upward(n);
      downward(4);
    }
        public static void upward(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
             for (int j2 = 1; j2 <=2*i-1; j2++) {
                System.out.print("*");
             }
              for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
            System.out.println();
        }
    }

  public static void downward(int n){
        for (int i = n; i>=1; i--) {
            for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
             for (int j2 = 1; j2 <=2*i-1; j2++) {
                System.out.print("*");
             }
            System.out.println();
        }
    }
}


// package Pattern_Matching;

// public class Pattern9 {

//     public static void main(String[] args) {
//         int n = 5;

//         upward(n);
//         downward(n - 1);
//     }

//     public static void upward(int n) {
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j2 = 1; j2 <= 2 * i - 1; j2++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }

//     public static void downward(int n) {
//         for (int i = n; i >= 1; i--) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j2 = 1; j2 <= 2 * i - 1; j2++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }