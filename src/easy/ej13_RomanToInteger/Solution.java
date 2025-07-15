package easy.ej13_RomanToInteger;

// Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer

public class Solution {
    private static int singleRomanValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int romanToInt(String s) {
        char[] word = s.toCharArray();
        int currentResult = 0;

        for (int i = 0; i < word.length; i++) {
            if (i + 1 < word.length) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    currentResult += 4;
                    i++;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    currentResult += 9;
                    i++;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    currentResult += 40;
                    i++;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    currentResult += 90;
                    i++;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    currentResult += 400;
                    i++;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    currentResult += 900;
                    i++;
                } else {
                    // si no entró en ningún par especial, agrego el valor individual
                    currentResult += singleRomanValue(word[i]);
                }
            } else {
                // si ya es el último carácter, sumo el valor individual
                currentResult += singleRomanValue(word[i]);
            }
        }
        return currentResult;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // 3
        System.out.println(romanToInt("IV"));        // 4
        System.out.println(romanToInt("IX"));        // 9
        System.out.println(romanToInt("LVIII"));     // 58
        System.out.println(romanToInt("MCMXCIV"));   // 1994

    }
}
