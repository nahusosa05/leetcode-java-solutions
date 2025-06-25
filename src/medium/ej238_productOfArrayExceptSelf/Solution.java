package medium.ej238_productOfArrayExceptSelf;
import java.util.Arrays;

// Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[nums.length];
        /*
        Para lograr una complejidad O(n), se construye el array de resultados en dos pasadas:
        1) En la primera pasada (de izquierda a derecha), se guarda en cada posición el producto
        de todos los elementos a su izquierda.
        2) En la segunda pasada (de derecha a izquierda), se multiplican los productos acumulados de la derecha.
        Así se evita usar división y se mantiene O(n) sin usar espacio extra adicional (más allá del array resultado).
        */

        output[0] = 1;
        for (int i = 1; i < length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int rigth = 1;
        for (int j = length - 1; j >= 0; j--) {
            output[j] *= rigth;
            rigth *= nums[j];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};

        // [22, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        // [0, 0, 9, 0, 0]
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
