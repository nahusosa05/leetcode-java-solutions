package medium.ej443_StringCompression;

// Problem: String Compression
// Link: https://leetcode.com/problems/string-compression


class Solution {
    // input array -> output array modificado, longitud
    // Estrategia: Two pointers (readPtr, WritePtr)
    public static int compress(char[] chars) {
        int writePtr = 0;  // Puntero para escribir en el array
        int readPtr = 0;   // Puntero para leer el array

        while (readPtr < chars.length) {
            char currentChar = chars[readPtr]; // carácter actual a comprimir
            int count = 0; // contador de repeticiones del carácter

            // contar las repeticiones de currentChar
            while (readPtr < chars.length && chars[readPtr] == currentChar) {
                readPtr++;
                count++;
            }

            // escribimos el currentChar en la posición de writePtr
            chars[writePtr++] = currentChar;

            // si count es mayor que 1, se escribe la cantidad de repeticiones del currentChar.
            if (count > 1) {
                String aux = Integer.toString(count);
                for (char c : aux.toCharArray()) {
                    chars[writePtr++] = c;
                }
            }
        }
    return writePtr;
    }

    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars1)); // Output: 6

        char[] chars2 = {'a'};
        System.out.println(compress(chars2)); // Output: 1

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars3)); // Output: 4
    }
}