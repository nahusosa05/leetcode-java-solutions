package easy.ej9_PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0) return false;

        StringBuilder sb = new StringBuilder("" + x);
        boolean output = true;
        int i = 0;
        int j = sb.length() - 1;

        while (output) {
            output = sb.charAt(i) == sb.charAt(j);
            i++;
            j--;
            if (i >= j) {
                break;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
    }
}
