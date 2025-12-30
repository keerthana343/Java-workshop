
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         for(int i=1;i<=R;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         for(int i=1;i<=R;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//                 if(j<i){
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
//     }
// }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         int C = sc.nextInt();
//         if(1<=R&&R<=100){
//             for(int i=0;i<R;i++){
//                 for(int j=0;j<C;j++){
//                    if (i == 0 || i == R - 1 || j == 0 || j == C - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//                 if(j<C-1){
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         int C = sc.nextInt();
//         if(1<=R&&R<=100){
//             for(int i=0;i<R;i++){
//                 for(int j=0;j<C;j++){
//                     System.out.print("*");
//                 if(j<C-1){
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
// }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         //Getting input via STDIN
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//          for (int i = R; i >= 1; i--) {
//             for (int j = i; j <= R; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         //Getting input via STDIN
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         for(int i=R;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         //Getting input via STDIN
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         for(int i=0;i<=R;i++){
//             for(int j=1;j<=R-i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         //Getting input via STDIN
//         Scanner sc = new Scanner(System.in);
//         int R = sc.nextInt();
//         for(int i=0;i<=R;i++){
//             for(int j=1;j<=R-i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        for(int i=0;i<=R;i++){
            for(int j=1;j<=R-i;j++){
                System.out.print(j+i);
            }
            System.out.println();
        }
    }
}