package medium.ej11_ContainerWithMostWater;

public class Solution {
    // Problem: Container With Most Water
    // Link: https://leetcode.com/problems/container-with-most-water

    public static int maxArea(int[] height) {
        // Estrategia: Con 2 punteros, busco en el array la altura máxima. Con la altura máxima busco
        // su ancho mediante sus índices, lo multiplico entre sí y lo guardo en una variable. Chequeo que sea mayor
        // comparándolo en cada iteración. Explorar pares de líneas que puedan generar un área mayor.
        int left = 0; // Puntero en el inicio del array
        int right = height.length-1; // Puntero al final del array
        int maxArea = 0; // min_height * width (right - left)

        while (left < right) {
            int currentHeight = Math.min(height[left],height[right]); // altura actual
            int width = right - left; // ancho actual (con estos índices)
            int currentArea = currentHeight * width; // área actual

            maxArea = Math.max(maxArea,currentArea);

            // Mover el puntero de la línea más corta para buscar una posible área mayor
            // Buscar una línea más alta ya sea left o right (aunque el ancho disminuya, una altura mayor puede compensar).
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); // 49

        int[] height2 = {1,1};
        System.out.println(maxArea(height2));
    }
}


