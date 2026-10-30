public class Ticket {

    private int entradasAdulto;
    private int entradasNino;
    private int packsGuia;

    private static final double precioAdulto = 9.60;
    private static final double precioNiño = 4.95;
    private static final double precioAudio = 3.50;
    private static final double descuentoGuia = 0.17;
   
    public Ticket(int entradasAdulto, int entradasNino, int packsGuia) {
        // Scanner scanner = new Scanner(System.in);
        this.entradasAdulto = entradasAdulto;
        this.entradasNino = entradasNino;
        this.packsGuia = packsGuia;
        
        // double calcularSubtotal = entradasAdulto + entradasNino + packsGuia;
        // double total = calcularSubtotal * descuentoGuia;
        
        
    }    
    // public double calcularSubtotal() {
    //     double calcularSubtotal = entradasAdulto + entradasNino + packsGuia;
    //     // double total = calcularSubtotal * descuentoGuia;
    //     return calcularSubtotal;
    //     // System.out.println("Precio total: " + calcularSubtotal);
    //     // System.out.println("Total final: " + total);
    // }
    public double calcularSubtotal() {
    double subtotal = entradasAdulto * precioAdulto + entradasNino * precioNiño + packsGuia * precioAudio;

    return subtotal;
    }

    public double calcularDescuentoAudioguias() {
    return packsGuia * precioAudio * descuentoGuia;
    }

    public double calcularTotal() {
        double total = calcularSubtotal() - calcularDescuentoAudioguias();
        return total;
    }

    public void imprimirTicket() {
    System.out.println("Subtotal: " + calcularSubtotal());
    System.out.println("Descuento: " + calcularDescuentoAudioguias());
    System.out.println("Total final: " + calcularTotal());
    }
}
