import java.util.Arrays;

public class DistClosestNumbers {

    static int distClosestNumbers(int[] numbers) {
        if (numbers.length < 2) {
            return -1; // No se pueden encontrar números cercanos con menos de 2 números.
        }

        Arrays.sort(numbers);
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            minDistance = Math.min(minDistance, numbers[i] - numbers[i - 1]);
        }

        return minDistance;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // El resultado esperado es 1 (los números más cercanos son 98 y 99)
    }
}
