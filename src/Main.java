import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del huesped: ");
        String nombre = sc.nextLine();
        System.out.println("Numero de noches: ");
        int numeroNoches = sc.nextInt();
        System.out.println("Tipo de habitaión: \n1. Habitacion Simple \n2. Habitacion Suite \n3. Habitacion Familiar \n    Opcion: ");
        int tipo = sc.nextInt();
        System.out.println("Servicios adicionales: ");
        Habitacion h = null;
        if(tipo == 1){
            System.out.println("¿Deayuno incluido? (true/false): ");
            boolean desayuno = sc.nextBoolean();
            h = new HabitacionSimple("H1", numeroNoches, true, desayuno);
        } else if(tipo == 2){
            System.out.println("¿Servicio Premium? (true/false): ");
            boolean premium = sc.nextBoolean();
            System.out.println("'Tiene jucuzzi? (true/false): ");
            boolean jacuzzi = sc.nextBoolean();
            h = new Suite("H2", numeroNoches, true, jacuzzi, premium);
        } else if(tipo == 3){
            System.out.println("Capacidad de personas: ");
            int capacidad = sc.nextInt();
            h = new HabitacionFamiliar("H3", numeroNoches, true, capacidad);
        } else {
            System.out.println("Error. Tipo invalido");
        }
        if(h.verificarDisponibilidad()){
            System.out.println("\n---- DATOS DEL HUESPED ----");
            System.out.println("Nombre: " + nombre);
            h.mostrarDetalle();

            double subtotal = h.calcularHospedaje();
            double descuento = 0;
            if(h.getNumeroNoches() > 5){
                descuento = subtotal * 0.10;
            }
            double iva = subtotal * 0.15;
            double total = subtotal - descuento + iva;
            System.out.println("\n----- FACTURA -----");
            System.out.println("Tipo: " + h.getTipoHabitacion());
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: " + descuento);
            System.out.println("IVA: " + iva);
            System.out.println("Total: $ " + total);
            h.setDisponible(false);
        } else {
            System.out.println("Habitacion no disponible");
        }
    }
}