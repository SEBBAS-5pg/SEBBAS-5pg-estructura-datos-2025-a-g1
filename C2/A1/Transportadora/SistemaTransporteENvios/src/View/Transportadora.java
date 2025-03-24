package View;
import Logic.*;

public class Transportadora {
    public static void main(String[] args) {

    TransporteAereo paquete_01 = new TransporteAereo();
    TransporteTerrestre paquete_02 = new TransporteTerrestre();

    paquete_01.setPeso(100.0);
    paquete_01.setCiudadDestino("Milan");

    paquete_02.setPeso(40000.0);
    paquete_02.setCiudadDestino("Bogotá");

    paquete_01.mostrar();
    paquete_02.mostrar();
}

}
