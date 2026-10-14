import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distancia del trayecto(Km): ");
        double distancia = scanner.nextDouble();
        System.out.println("Consumo(L/100Km): ");
        double consumo = scanner.nextDouble();
        System.out.println("Ocupantes: ");
        int ocupantes = scanner.nextInt();
        System.out.println("Precio del combustible (€/L): ");
        double gasofa = scanner.nextDouble();

        double consumoKM = consumo / 100;
        double combustibleConsumido = distancia * consumoKM;
        double costeViaje = combustibleConsumido * gasofa;
        double costePorOcupante = costeViaje / ocupantes;
        

        System.out.println("================================");
        System.out.println("Parking CPIFP Alan Turing");
        System.out.println("================================");
        System.out.println("Combustible consumido: " + combustibleConsumido +" litros");
        System.out.println("Coste viaje: " + costeViaje +"€");
        System.out.println("Coste por ocupante: " + costePorOcupante +"€");
        double ocupantesFinales = ocupantes - 1;
        double total = costeViaje * ocupantesFinales;
        System.out.println("Total ahorrado: " + total);


        // System.out.println(distancia);
        // System.out.println(consumo);
        // System.out.println(ocupantes);
        // System.out.println(gasofa);


// Distancia trayecto (Km): 25      Pedir un double
// Consumo (L/100Km): 6             pedir un double
// Ocupantes: 4                     Pedir un Int
// Precio del combustible (€/l): 1.98   Pedir un double
// 
// 
// ===================================
// Parking CPIFP Alan Turing
// ===================================
// 
// Combustible consumido: 1.50 litros
// Coste de viaje: 2.97€
// Coste por ocupante: 0.74€
// Tota ahorrado: 8.91€
    }
}
