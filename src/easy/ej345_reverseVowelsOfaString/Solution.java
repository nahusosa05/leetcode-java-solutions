package easy.ej345_reverseVowelsOfaString;

// Problem: Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string

public class Solution {
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {
        char[] out = s.toCharArray();
        int lastIndex = out.length-1;

        for (int i = 0; i < lastIndex; i++) {
            if (isVowel(out[i])) {
                for (int j = lastIndex; j > i ; j--) {
                    if (isVowel(out[j])) {
                        char aux = out[i];
                        out[i] = out[j];
                        out[j] = aux;
                        lastIndex = j - 1;
                        break;
                    }
                }
            }
        }
        return new String(out);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        String s2 = "leetcode";

        // Output: "AceCreIm"
        System.out.println(reverseVowels(s));
        // Output: "leotcede"
        System.out.println(reverseVowels(s2));
    }
}
