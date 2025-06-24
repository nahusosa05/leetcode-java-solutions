package easy.ej1768_mergeStringsAlternately;

// Problema: Merge Strings Alternately
// Enlace: https://leetcode.com/problems/merge-strings-alternately

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder out = new StringBuilder();
        char[] wordOne = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();

        for (int i = 0; i < wordTwo.length || i < wordOne.length; i++) {
            if (i < wordOne.length) {
                out.append(word1.charAt(i));
            }
            if (i < wordTwo.length) {
                out.append(word2.charAt(i));
            }
        }

        return out.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        // "apbqcr"
        System.out.println(mergeAlternately(word1,word2));
    }
}
