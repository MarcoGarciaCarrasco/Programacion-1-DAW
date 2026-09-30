
import java.util.Scanner;



public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desde que altura caerá el objeto");
        double distancia = scanner.nextInt();

        double g = 9.81;

        if (distancia < 0){

            System.out.println("La distancia de caida no puede ser negativa");

        }else{
            double calculo = Math.sqrt((2 * distancia) / g);
            System.out.println("El objeto tardará " + calculo + "s en caer");
        }
    }
}
