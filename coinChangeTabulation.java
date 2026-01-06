import java.lang.reflect.Array;
import java.util.Arrays;

public class coinChangeTabulation {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+1); // Initialize with a value greater than amount
        dp[0] = 0; // There's one way to make amount 0

        for (int i=1; i<=amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println("Number of ways to make change: " + coinChange(coins, amount));
    }
}
