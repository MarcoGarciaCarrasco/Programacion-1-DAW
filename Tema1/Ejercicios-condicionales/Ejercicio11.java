import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce un número entero: ");
        numero = scanner.nextInt();

        if (numero < 0){
            numero = numero * -1;
        }

        if (numero >= 0 && numero <10){
            System.out.println("Tiene una sola cifra");
        }else if (numero >= 10 && numero < 100){
            System.out.println("El numero tiene dos cifras");
        }else if (numero >= 100 && numero < 1000){
            System.out.println("El numero tiene 3 cifras");
        }else if (numero >= 1000 && numero < 10000){
            System.out.println("El numero tiene 4 cifras");
        }else if (numero >= 10000 && numero < 100000){
            System.out.println("El numero tiene 5 cifras");
        }else {
            System.out.println("El numero introducido tiene demasiadas cifras");
        }
    }
}
