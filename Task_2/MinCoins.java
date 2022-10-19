package Task_2;
public class MinCoins
{
    public int minNoCoins(int coinsArr[], int m, int Y)
    {
        if (Y == 0)
        {
            return 0;
        }

        int result = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++)
        {
            if (coinsArr[j] <= Y)
            {
                int subRes = minNoCoins(coinsArr, m, Y - coinsArr[j]);

                if (subRes != Integer.MAX_VALUE && subRes + 1 < result)
                {
                    result = subRes + 1;
                }
            }
        }
        return result;
    }
    public static void main(String argvs[])
    {
        MinCoins obj = new MinCoins();

        int coinsArr[] = {1,5,10,20,50};

        int size = coinsArr.length;
        int Y = 70;

        int ans = obj.minNoCoins(coinsArr, size, Y);

        System.out.println("For the sum "+ Y);
        System.out.println("The minimum number of required coins is: "+ ans);
        System.out.println("Using the following coins: ");

        for(int i = 0; i < size; i++)
        {
            System.out.print(coinsArr[i] + " ");
        }

        System.out.println("\n");
    }
}
