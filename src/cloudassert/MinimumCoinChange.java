package cloudassert;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Coins available :");
        int noOfCoins = scanner.nextInt();
        int[] coins = new int[noOfCoins];

        System.out.println("Enter each coins :");
        for(int i=0;i<noOfCoins;i++)
        {
            coins[i] = scanner.nextInt();
        }

        System.out.println("Enter the Amount for which minimum no of changes is required :");
        int amount = scanner.nextInt();

        System.out.println("The Minimum no of changes required for the given amount : "+ minimumCoinChange(coins,amount));
    }

    private static int minimumCoinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1]; //Creating an array up to the size of the amount

        Arrays.fill(dp,amount+1); //filling the array with value amount+1

        dp[0] = 0; //Minimum no of coins required for amount zero

        for(int i=1; i <= amount; i++)
        {
            for(int coin : coins)
            {
                if(i - coin >=0)
                {
                    dp[i] = Math.min(dp[ i ] ,dp[ i - coin ] +1);
                    /*
                    * we are iterating through each index from 0 to amount
                    * for each index we are checking the number of coins needed
                    * here's where dp comes, initializing dp[0] with 0 and then when dp[1] we check the coin available
                    * and then if ` i - coin >= 0 ` this verifies that the changes is not greater than given amount,
                    * and then we find minimum of dp[i] , dp[i - coin] +1 ,
                    * where we have already dp[0] =0 , so ` dp[1] = min of dp[1] , dp[0] +1 `
                    * thus we get dp[1] = 1, this process repeats until the amount
                    * */
                }
            }
        }
       return  dp[amount] > amount ? -1 : dp[amount];
    }
}
