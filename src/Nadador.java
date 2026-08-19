import java.util.Locale;

public class Nadador extends Deportista{

    private double distancia;
    private double tiempo;
    private String estilo;

    public Nadador() {
    }

    public Nadador(String nombre, int edad, String pais, int horasEntrenamiento, double distancia, double tiempo, String estilo) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nadador{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", estilo=" + estilo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }


    public double calcularVelocidad(){
        double porcentaje;
        switch (estilo.toLowerCase(Locale.ROOT)){
            case "libre":
                porcentaje = 0.10;
                break;

            case "espalda":
                porcentaje = 0.8;
                break;

            case "pecho":
                porcentaje = 0.6;
                break;

            case "mariposa":
                porcentaje = 0.12;
                break;
            default:
                porcentaje = 0;
                break;
        }
        return porcentaje;
    }

    public double calcularRendimientoBase(){
        return calcularVelocidad()*horasEntrenamiento;
    }

    @Override
    public double calcularRendimiento() {

        double rendimientoBase = calcularRendimientoBase();
        double bono = rendimientoBase * 0.12;


        return rendimientoBase * bono;
    }
}
