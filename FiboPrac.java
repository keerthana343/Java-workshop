// public class FiboPrac {
//     static int fib(int n){
//         if(n <=1){
//             return n;
//         return fib(n-1)+fib(n-2);
//         }
//         }
//         public static void main(String[] args){
//             int n=6;
//             System.out.println("Fibonacci ("+n+")="+fib(n));

//         }
//     }


// public class FiboPrac{
//     static int[] dp;
//     static int fib(int n){
//         if(n<=1){
//             return n;
//         }

//         if(dp[n] !=-1){
//             return dp[n];
//         }
//         return dp[n] = fib(n-1) + fib(n-2);
//     }

//     public static void main(String[] args){
//         int n=50;
//         dp = new int[n + 1];
//         Arrays.fill(dp , -1);

//         System.out.println("fib("+ n +"):"+fib(n));

//     }
// }



// public class FiboPrac{

//     static int fib(int n){
//         if(n<=1){
//             return n;
//         }

//         int dp[] = new dp[n+1];
//         int dp[0]=0;
//         int dp[1]=1;

//         for(int i=0;i<=dp[n];i++){
//             dp[n]=dp[n-1]+dp[n-2];
//         }
//         return dp[n];
//     }
// public static void main (String[] args){
//     int n=6;
//     System.out.println("fib("+n+"):"+dp[n]);
// }

// }


//fibonacci optimized.
// public class FiboPrac{
//     static int fib(int n){
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }

//         int prev2=0;
//         int prev1=1;
//         int curr =0;

//         for(int i=2;i<=n;i++){
//             curr=prev2+prev1;
//             prev2=prev1;
//             prev1=curr;
//         }
//         return curr;
//     }
//     public static void main(String[] args) {
//         int n=6;
//         System.out.println("fib("+n+"):"+fib(n));
//     }
// }


