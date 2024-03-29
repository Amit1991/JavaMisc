package InterviewQues;

public class CoinCount
{
    static int minCoins(int coins[], int V)
    {
        if (V == 0) return 0;
        int res = Integer.MAX_VALUE;

        for (int i=0; i<coins.length; i++)
        {
            if (coins[i] <= V)
            {
                int sub_res = minCoins(coins,V-coins[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        int coins[] = {1, 3, 5, 7, 9, 11};
        int V = 15;
        System.out.println("Minimum coins required is "+ minCoins(coins, V));
    }
}