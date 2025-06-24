package easy.ej1071_greatestCommonDivisorofStrings;

// Problema: Greatest Common Divisor of Strings
// Enlace: https://leetcode.com/problems/greatest-common-divisor-of-strings

public class Solution {
    // For two strings s and t, we say "t divides s" if and only if
    // s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Calculo el máximo común divisor (GCD) de las longitudes de los strings
        // para encontrar el tamaño del patrón repetido común
        int a = str1.length();
        int b = str2.length();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return str1.substring(0,a);
    }

    public static void main(String[] args) {
        String str1 = "LEET";
        String str2 = "CODE";
        String output = gcdOfStrings(str1,str2);
        System.out.println(output);
    }
}
