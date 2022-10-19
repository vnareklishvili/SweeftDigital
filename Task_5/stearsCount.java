package Task_5;

public class stearsCount {
    public static void main(String args[]) {
        System.out.println(countVariants(2));
    }

    public static int countVariants(int stairCount) {
        int x = nextStep(1, 0, stairCount) + nextStep(2, 0, stairCount);
        return x;
    }

    public static int nextStep(int step, int sum, int n) {
        int updatedSum = step + sum;
        if (updatedSum == n) {
            return 1;
        } else if (updatedSum > n) {
            return 0;
        }else {
            return nextStep(1, updatedSum, n) + nextStep(2, updatedSum, n);
        }
    }

}