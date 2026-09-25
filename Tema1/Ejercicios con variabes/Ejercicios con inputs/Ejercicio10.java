import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introduce la primera nota que has sacado en el examen: ");
        double nota1 = scanner.nextDouble();
        System.out.println ("Y que nota quieres sacar en el trimestre? ");
        double notadeseada = scanner.nextDouble();
        double nota1valor = nota1 * (0.4);
        double notadeseadavalor = notadeseada * (0.6);
        System.out.println  ("Si deseas sacar " + notadeseada + "en el siguiente examen debes sacar");

    }
    
}
