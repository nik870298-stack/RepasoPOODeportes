public class Futbolista extends Deportista{

    private double tiempoEntrenamiento;
    private String equipo;
    private int goles;

    public Futbolista() {
    }

    public Futbolista(String nombre, int edad, String pais, int horasEntrenamiento, double tiempoEntrenamiento, String equipo, int goles) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.tiempoEntrenamiento = tiempoEntrenamiento;
        this.equipo = equipo;
        this.goles = goles;
    }

    public double getTiempoEntrenamiento() {
        return tiempoEntrenamiento;
    }

    public void setTiempoEntrenamiento(double tiempoEntrenamiento) {
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "tiempoEntrenamiento=" + tiempoEntrenamiento +
                ", equipo='" + equipo + '\'' +
                ", goles=" + goles +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }




    @Override
    public double calcularRendimiento() {
        return 0;
    }
}
