import java.util.Arrays; // Importa la clase Arrays para usar la función de ordenamiento.

public class DistClosestNumbers {

    // Función para calcular la distancia entre los dos números más cercanos en un arreglo.
    static int distClosestNumbers(int[] numbers) {
        if (numbers.length < 2) {
            return -1; // Si hay menos de 2 números en el arreglo, no se pueden encontrar números cercanos.
        }
        Arrays.sort(numbers); // Ordena el arreglo en orden ascendente.
        int minDistance = Integer.MAX_VALUE; // Inicializa una variable para almacenar la distancia mínima.
        for (int i = 1; i < numbers.length; i++) {
            // Compara la diferencia entre elementos adyacentes y actualiza minDistance si es menor.
            minDistance = Math.min(minDistance, numbers[i] - numbers[i - 1]);
        }
        return minDistance; // Retorna la distancia mínima entre los números más cercanos.
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65}; // Arreglo de números de prueba.
        int result = distClosestNumbers(testArray); // Llama a la función para encontrar la distancia mínima.
        System.out.println(result); // Imprime el resultado. El esperado es 1 (los números más cercanos son 98 y 99).
    }
}
