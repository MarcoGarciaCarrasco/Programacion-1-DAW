import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
    String lunes = "Itinerario Personal Para la Empleabilidad";
    String martes = "Entornos de Desarrollo";
    String miercoles = "Entornos de Desarrollo";
    String jueves = "Base de Datos";
    String viernes = "Sistemas Informáticos";

    


    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un dia de la semana, con el numero correspondiente (1-5): ");
    int dia = scanner.nextInt();

    if (dia == 1) {
        System.out.println("El lunes toca: " + lunes);
    } else if (dia == 2) {
        System.out.println("El martes toca: " + martes);
    } else if (dia == 3) {
        System.out.println("El miercoles toca: " + miercoles);
    } else if (dia == 4) {
        System.out.println("El jueves toca: " + jueves);
    } else if (dia == 5) {
        System.out.println("El viernes toca: " + viernes);
    } else {
        System.out.println("Ese numero no corresponde con los valores ofrecidos.");
    }

    
}
}