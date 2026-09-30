
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        // 1. Pedir los valores de a y b (usamos double para admitir decimales)
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
        double b = scanner.nextDouble();

        // 2. Evaluar las condiciones
        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            // 3. Calcular y mostrar el resultado
            double x = -b / a;
            System.out.println("x = " + x);
        }

        scanner.close();
    }
}
