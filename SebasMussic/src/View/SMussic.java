package View;

import Logic.Cancion;
import Logic.EquipoSonido;
import Logic.ReproductorMusica;

public class SMussic {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", 240);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", 360);

        EquipoSonido miEquipo = new EquipoSonido("Sony", "Xplod");
        ReproductorMusica miReproductor = new ReproductorMusica();

        miEquipo.encender();
        miReproductor.cargarCancion(cancion1);
        miReproductor.reproducir();
        miReproductor.pausar();
        miReproductor.cargarCancion(cancion2);
        miReproductor.reproducir();
        miReproductor.detener();
        miEquipo.apagar();
    }

}
