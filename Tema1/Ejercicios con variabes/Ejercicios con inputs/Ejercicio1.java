import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce un segundo número entero:");
        int numero2 = scanner.nextInt();
        System.out.println ("x = " + numero1);
        System.out.println ("y = " + numero2);
        System.out.println ( "x + y = " + (numero1 + numero2));
        System.out.println ("x - y = " + (numero1 - numero2));
        System.out.println ("x / y = " + (double) numero1 / (double) numero2);
        System.out.println ("x * y = " + (numero1 * numero2));
        
        scanner.close();



    }
}
