
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una hora del dia(00-23): ");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora <= 12 ) {

            System.out.println ("Buenos días.");

        }else if (hora >= 13 && hora <=20) {    

            System.out.println("Buenas tardes.");

        }else if (hora >= 21 && hora <=23) {

            System.out.println("Buenas noches.");

        }else if (hora >=0 && hora <=5) {

            System.out.println("Buenas noches.");

        }
        else if (hora > 24 ){
            System.out.println("El valor introducido no es correcto");
        }
    }
}

