public class CoinChangeBruteForce {
    // public static int coinChange(int[] coins, int amount) {
    //     return coinChangeHelper(coins, amount, 0);
    // }

    // private static int coinChangeHelper(int[] coins, int amount, int index) {
    //     if (amount == 0) {
    //         return 0;
    //     }
    //     if (amount < 0 || index >= coins.length) {
    //         return Integer.MAX_VALUE;
    //     }

    //     // Include the coin at the current index
    //     int includeCoin = coinChangeHelper(coins, amount - coins[index], index);
    //     if (includeCoin != Integer.MAX_VALUE) {
    //         includeCoin += 1; // Count this coin
    //     }

    //     // Exclude the coin at the current index
    //     int excludeCoin = coinChangeHelper(coins, amount, index + 1);

    //     return Math.min(includeCoin, excludeCoin);
    // }

    // public static void main(String[] args) {
    //     int[] coins = {1, 2, 5};
    //     int amount = 11;
    //     int result = coinChange(coins, amount);
    //     if (result == Integer.MAX_VALUE) {
    //         System.out.println("No solution");
    //     } else {
    //         System.out.println("Minimum coins needed: " + result);
    //     }
    // }
}
