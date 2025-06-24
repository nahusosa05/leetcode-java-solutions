package easy.ej1768_mergeStringsAlternately;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        String out = "";
        char[] wordOne = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();

        for (int i = 0; i < wordTwo.length || i < wordOne.length; i++) {
            if (i < wordOne.length) {
                out += word1.charAt(i);
            }
            if (i < wordTwo.length) {
                out += word2.charAt(i);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        String word1 = "HOLA";
        String word2 = "uwu";

        // "apbqrs"
        System.out.println(mergeAlternately(word1,word2));
    }
}
