
public class Ejercicio5 {
    public static void main(String[] args) {
        double BaseImponible = 468.0;
        double IVA = 0.21;
        Double Preciofinal = BaseImponible * IVA; 

        System.out.println("Base Imponible: " + BaseImponible);

        System.out.println("\nIVA: " + Preciofinal);

        System.out.println("Precio final: " + (BaseImponible + Preciofinal));
    }
}
