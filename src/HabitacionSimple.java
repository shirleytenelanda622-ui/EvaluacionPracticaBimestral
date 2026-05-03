public class HabitacionSimple extends Habitacion{
    private boolean desayunoIncluido;
    private int costoServicioBasico;

    public HabitacionSimple(String codigo,int numeroNoches, boolean disponible, boolean desayunoIncluido) {
        super(codigo, "Simple", 35, numeroNoches, disponible);
        this.desayunoIncluido = desayunoIncluido;
        this.costoServicioBasico = 5;
    }
    @Override
    public double calcularHospedaje(){
        double total = getTarifaBase() * getNumeroNoches();
        if(desayunoIncluido == true){
            total += costoServicioBasico;
        }
        return total;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("    HABITACIÓN SIMPLE");
        System.out.println("Noches: " + getNumeroNoches());
        System.out.println("Desayuno: " + (desayunoIncluido ? "Sí" : "No"));
    }
}
