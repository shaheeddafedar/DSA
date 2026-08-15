package Pattern_Matching;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
      pattern8(n);
    }

    public static void pattern8(int n){
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

// public class Pattern8 {
//     public static void main(String[] args) {
//         int n=5;
//       pattern8(n);
//     }

//     public static void pattern8(int n){
//         for (int i = 0; i <n; i++) {
//             for (int j = 0; j<i; j++) {
//              System.out.print(" ");
//             }
//              for (int j2 = 0; j2 <2*n-(2*i+1); j2++) {
//                 System.out.print("*");
//              }

//             System.out.println();
//         }
//     }
// }



