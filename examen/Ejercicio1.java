import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Cuantos adultos vienen?");
        int adultos = scanner.nextInt();
        System.out.println("Y cuantos niños?");
        int niños = scanner.nextInt();
        System.out.println("Y quieres contratar un audioguía? Si es así especifica cuantos:");
        int guias = scanner.nextInt();

        double precioAdulto = 9.60;
        double precioNiño = 4.95;
        double precioGuia = 3.50;

        precioAdulto = precioAdulto * adultos;
        precioNiño = precioNiño * niños;
        precioGuia = precioGuia * guias;

        double subtotal = precioAdulto + precioNiño + precioGuia;

        double descuentoGuia = precioGuia * 0.17;

        precioGuia = precioGuia - descuentoGuia;

        double totalApagar = precioAdulto + precioNiño + precioGuia;


        System.out.println("==================================");
        System.out.println("          Cueva De Nerja      ");
        System.out.println("==================================");
        System.out.println("Cliente: " + nombre +"\n");
        
        System.out.println("Producto             Cant. Importe");
        System.out.println("----------------------------------");
        System.out.println("Adultos              "+        adultos + "      " +         precioAdulto+"€"    );
        System.out.println("Niños                "+        niños +  "       " +            precioNiño+"€"    );
        System.out.println("Guías                "+        guias +   "      " +            precioGuia+"€"    );
        System.out.println("---------------------------------- \n");

        System.out.println("Subtotal:                    " + subtotal+"€");
        System.out.println("Descuento guías:             "  + descuentoGuia+"€");
        System.out.println("TOTAL A PAGAR:               " +  totalApagar+"€");




    }
}

// =================================

//         Cueva De Nerja

// =================================
// Cliente: Marco

// Producto            Cant. Importe
// ---------------------------------
// Adultos                 2  19.20€        Adultos 9,60
// Niños                   2   9.90€        Niños 4.95
// Guías                   4  14.00€        Guias 3.50 con descuento 17%
// ---------------------------------

// Subtotal:                  43.10€
// Descuento Guías:            2.38€
// TOTAL A PAGAR:             40.72€        FONDO BLANCO CON LETRAS ROJAS Y EN NEGRITA