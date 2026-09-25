import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, introduce tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola " + nombre + ", encantado de conocerte.");
    System.out.print("Que edad tienes?  ");
    int edad = scanner.nextInt();

    boolean esMayor = edad >= 18;

    if (esMayor) {
        System.out.println("Eres mayor de edad.");
    } else {
        System.out.println("Eres menor de edad.");
    }    
}
}