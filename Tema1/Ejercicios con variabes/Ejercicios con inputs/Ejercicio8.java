import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introduce la base de un triángulo: ");
        int base = scanner.nextInt();
        System.out.println ("Introduce la altura de un triángulo: ");
        int altura = scanner.nextInt();

        int calculo = ((base * altura) / 2);

        System.out.println("El área del triángulo es: " + calculo + "cm²");



    }
}

