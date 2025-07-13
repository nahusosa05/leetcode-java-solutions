package medium.ej1456_MaximumNumberOfVowelsInaASubstringOfGivenLength;

// Problem: Maximum Number of Vowels in a Substring of Given Length
// Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length

public class Solution {
    public static boolean isVowel (char c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }

    public static int maxVowels(String s, int k) {
        int sumVowels = 0;

        for (int i = 0; i < k; i++) {
            if ( isVowel(s.charAt(i)) ) {
                sumVowels++;
            }
        }

        int maxVowels = sumVowels;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) sumVowels++;
            if (isVowel(s.charAt(i-k))) sumVowels--;
            maxVowels = Math.max(maxVowels,sumVowels);
        }

        return maxVowels;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels("aeiou",2));
        System.out.println(maxVowels("leetcode",3));
    }
}
