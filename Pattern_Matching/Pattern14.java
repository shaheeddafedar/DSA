
// package Pattern_Matching;

// public class Pattern14{
//     public static void main(String[] args) {
//         int n = 5;
//         pattern14(n);
//     }

//     public static void pattern14(int n) {
//         for (int i = 1; i <=n; i++) {
//                     int startnum=65;
//             for (int j = 1; j<=i; j++) {
//                 char values = (char)startnum;
//                 System.out.print(values);
//                 System.out.print(" ");
//                 startnum+=1;
//             }
//             System.out.println();
//         }
//     }

// }



package Pattern_Matching;

public class Pattern14{
    public static void main(String[] args) {
        int n = 5;
        pattern14(n);
    }

    public static void pattern14(int n) {
        for (int i = 0; i <n; i++) {
            for (char j = 'A'; j <='A'+i; j++) {
               System.out.print(j);
            }
             System.out.println();
        }
    }

}




