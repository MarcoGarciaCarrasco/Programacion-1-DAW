import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE TIEMPO");
        System.out.println("=====================");
        System.out.println("Introduce una cantidad de segundos: ");
        int segundos = scanner.nextInt();

        // int horas = segundos / 3600;

        int minutos = segundos / 60;
        int horas = minutos / 60;
        System.out.println(segundos + " segundos son: " + horas + "hora, "+ minutos + "minutos y " + segundos +"segundos");

    }
}
