package medium.ej3_LongestSubstringWithoutReapeatingCharacters;
import java.util.HashSet;

public class Solution {
    // Retorna la longitud del longestSubstring creado.
    public static int lengthOfLongestSubstring(String s) {
        // Con start y end defino la nueva subcadena. En maxLen guardo la nueva longitud de esa subcadena (la mayor)
        int start = 0, end = 0, maxLen = 0;
        // para guardar chars únicos
        var hs = new HashSet<Character>();

        while (end < s.length()) {
            // Chequeo el currentChar si no está incluido en el set:
            // si no está -> lo agrego y actualizo maxLen
            // si está -> elimino repetidos y lo vuelvo a agregar.
            char currentChar = s.charAt(end);
            if (!hs.contains(currentChar)) {
                hs.add(currentChar);
                maxLen = Math.max(maxLen,end-start+1);
            } else {
                while (hs.contains(currentChar)) {
                    hs.remove(s.charAt(start));
                    start++;
                }
                hs.add(currentChar);
            }
            end++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3 ("abc")
        System.out.println(lengthOfLongestSubstring("bbbbb")); // 1 ("b")
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3 ("wke")
    }
}
