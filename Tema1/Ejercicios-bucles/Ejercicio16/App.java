import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero ;
        boolean esPrimo = true;

        System.out.println("Introduce un numero entero y te dire si es primo o no: ");
        numero = scanner.nextInt();

        if (numero <= 1){
            esPrimo=false; 
        } else {
            for (int i = 2; i <=Math.sqrt(numero) && esPrimo; i++) {
                if (numero % i == 0) {
                    esPrimo =false;
                }
            }
        }
    if (esPrimo) {
        System.out.println("El numero es primo");
    } else {
        System.out.println("No es primo");
    }
    }
}
