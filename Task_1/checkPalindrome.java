package Task_1;
import java.util.Scanner;
public class checkPalindrome {
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER STRING: to know is it palindrome or not");
        String str = scanner.next();
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
