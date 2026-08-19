import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Corredor corredor1 = new Corredor( "Juan", 26, "Colombia", 26, 3.45,15.5 );
        Ciclista ciclista1 = new Ciclista("Ana", 24, "España", 65, 123.5, 80, 5.9);
        Nadador nadador1 = new Nadador("Luan", 22, "Francia", 58, 32, 12.6, "libre");
        Futbolista futbolista1 = new Futbolista();

        List<Deportista> lstDeportista = new ArrayList<>();

        lstDeportista.add(corredor1);
        lstDeportista.add(ciclista1);
        lstDeportista.add(nadador1);
        lstDeportista.add(futbolista1);

        for (Deportista d1 : lstDeportista){
            System.out.println(d1);
        }
    }
}