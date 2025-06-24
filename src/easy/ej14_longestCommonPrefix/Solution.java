package easy.ej14_longestCommonPrefix;

// Problema: Longest Common Prefix
// Enlace: https://leetcode.com/problems/longest-common-prefix

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String out = "";
        if (strs == null || strs.length == 0 ) return out;

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Siendo str un string cualquiera str.indexOf(prefix) devuelve la posición donde
            // empieza el string pasado como parámetro:
            // prefix = "fl" y str = "flower" -> str.indexOf(prefix) da 0
            // prefix = "ow" y str ="flower" -> str.indexOf(prefix) da 2
            // prefix = "cat" y str = "dog" -> str.indexOf(prefix) da -1
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"holaespepe","holasoypepe","holasoynahuel"};
        System.out.println(longestCommonPrefix(words));
    }
}
