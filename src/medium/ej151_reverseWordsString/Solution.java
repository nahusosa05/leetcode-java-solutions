package medium.ej151_reverseWordsString;

// Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string

public class Solution {
    public static String reverseWords(String s) {
        // [\\s+] Reemplaza uno o más espacios seguidos (o tabs, saltos de línea) por un solo espacio.
        s = s.trim().replaceAll("\\s+", " ");

        // Separo el string mediante los espacios.
        String[] words = s.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = words.length - 1; i >= 0 ; i--) {
            output.append(words[i]);
            if (i != 0) {
                output.append(" ");
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String s2 = " hello world ";

        // "blue is sky the"
        System.out.println(reverseWords(s));
        // "world hello"
        System.out.println(reverseWords(s2));
    }
}
