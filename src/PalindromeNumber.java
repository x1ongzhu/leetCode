/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int length = 0;
        int y = x;
        while (y > 0) {
            y = y / 10;
            length++;
        }

        for (int i = 0; i < length / 2; i++) {
            int end = x / (int) Math.pow(10, i) % 10;
            int start = x / (int) Math.pow(10, (length - i - 1)) % 10;
            if (start != end) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12));
    }
}
