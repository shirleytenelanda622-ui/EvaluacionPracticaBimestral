abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;

    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible) {
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        this.tarifaBase = tarifaBase;
        this.numeroNoches = numeroNoches;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setTarifaBase(double tarifaBase) {
        if(tarifaBase > 0){
            this.tarifaBase = tarifaBase;
        }
    }

    public void setNumeroNoches(int numeroNoches) {
        if(numeroNoches > 0){
            this.numeroNoches = numeroNoches;
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract double calcularHospedaje();
    public abstract void mostrarDetalle();
    public boolean verificarDisponibilidad(){
        return disponible;
    }
}
