import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introduce el lado de un rectángulo: ");
        int lado = scanner.nextInt();
        System.out.println ("Introduce la altura de un rectángulo: ");
        int altura = scanner.nextInt();

        int calculo = (lado * altura);

        System.out.println("El área del rectangulo es: " + calculo + "cm²");



    }
}
