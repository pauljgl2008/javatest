public class Fibonacci {
// Método recursivo para calcular Fibonacci
public static int fibonacciRecursivo(int n) {
    if (n <= 0) {
        return n;
    }
    if (n == 1) {
        return 1;
    }
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}


// Método iterativo para calcular Fibonacci
public static int fibonacciIterativo(int n) {
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}
    public static void main(String[] args) {
        int numero = 2;
        int fibonacciRecursivo = fibonacciRecursivo(numero);
        int fibonacciIterativo = fibonacciIterativo(numero);
        System.out.println("El número " + numero + " en fibonacciRecursivo es: " + fibonacciRecursivo);
        System.out.println("************************************************************************");
        System.out.println("El número " + numero + " en fibonacciIterativo es: " + fibonacciIterativo);
    }
}