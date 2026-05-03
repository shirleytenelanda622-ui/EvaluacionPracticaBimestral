public class HabitacionFamiliar extends Habitacion {
    private int capacidadPersonas;
    private double descuentoFamiliar;

    public HabitacionFamiliar(String codigo, int numeroNoches, boolean disponible, int capacidadPersonas) {
        super(codigo, "Familiar", 60, numeroNoches, disponible);
        this.capacidadPersonas = capacidadPersonas;
    }
    @Override
    public double calcularHospedaje(){
        double total =  getTarifaBase() * getNumeroNoches();
        if( capacidadPersonas >= 4){
            total -= descuentoFamiliar;
        }
        return total;
    }
    @Override
    public void mostrarDetalle(){
        System.out.println("    HABITACIÓN FAMILIAR");
        System.out.println("Capacidad: " + capacidadPersonas);
        System.out.println("Descuento aplicado: " + descuentoFamiliar);
    }
}
