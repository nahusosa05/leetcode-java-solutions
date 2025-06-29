# LeetCode Java Solutions

Este repositorio contiene soluciones en Java a problemas de algoritmos y estructuras de datos, principalmente del plan de estudio [LeetCode 75](https://leetcode.com/studyplan/leetcode-75/).

El objetivo es mejorar la lógica de programación y preparar entrevistas técnicas mediante la práctica diaria.

## Estructura

Las soluciones están organizadas por dificultad:
`````markdown
leetcode-java-solutions/src/
├── easy/
├── medium/
├── hard/
`````

## Ejemplo de solución

```java
// Problema: Two Sum
// Enlace: https://leetcode.com/problems/two-sum/

public int[] twoSum(int[] nums, int target) {
    int[] out = new int[2];
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                out[0] = i;
                out[1] = j;
                break;
            }
        }
    }
    return out;
}
```

Cada archivo incluye:
- Enlace al problema original
- Código comentado

## Progreso
- Objetivo: resolver un ejercicio diario.
- Problemas resueltos: 12
- Lenguaje: Java

## Links de interés
- [Mi perfil de LeetCode](https://leetcode.com/u/n4uh_7/)
