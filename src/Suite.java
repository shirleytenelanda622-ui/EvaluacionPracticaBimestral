public class Suite extends Habitacion{
    private boolean jacuzzi;
    private boolean servicioPremium;

    public Suite(String codigo, int numeroNoches, boolean disponible, boolean jacuzzi, boolean servicioPremium) {
        super(codigo, "Suite", 80, numeroNoches, disponible);
        this.jacuzzi = jacuzzi;
        this.servicioPremium = servicioPremium;
    }
    @Override
    public double calcularHospedaje(){
        double total = getTarifaBase() * getNumeroNoches();
        if(servicioPremium){
            total += 20 * getNumeroNoches();
        }
        if(jacuzzi){
            total += 15 * getNumeroNoches();
        }
        return total;
    }
    @Override
    public void mostrarDetalle(){
        System.out.println("    HABITACIÓN SUITE");
        System.out.println("Noches: " + getNumeroNoches());
        System.out.println("Servicio Premium: " + (servicioPremium ? "Sí" : "No"));
        System.out.println("Jacuzzi: " + (jacuzzi ? "Sí" : "No"));
    }
}
