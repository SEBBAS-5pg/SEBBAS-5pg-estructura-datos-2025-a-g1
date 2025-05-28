// Paquete para las clases de vista (punto de entrada principal de la aplicación)
package View;

// Importa las clases necesarias del paquete Logic
import Logic.Cancion;
import Logic.EquipoSonido;
import Logic.ReproductorMusica;

/**
 * Clase principal para demostrar la interacción entre los objetos Cancion, EquipoSonido y ReproductorMusica.
 */
public class SMussic {

    public static void main(String[] args) {
        // 1. Instanciación de objetos

        // Crea dos objetos Cancion
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", 240);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", 360);

        // Crea un objeto EquipoSonido
        EquipoSonido miEquipo = new EquipoSonido("Sony", "Xplod");

        // Crea un objeto ReproductorMusica
        ReproductorMusica miReproductor = new ReproductorMusica();

        // 2. Interacción entre objetos y demostración de funcionalidades

        // Enciende el equipo de sonido
        miEquipo.encender();

        // Carga y reproduce la primera canción
        miReproductor.cargarCancion(cancion1);
        miReproductor.reproducir();

        // Pausa la canción actual
        miReproductor.pausar();

        // Carga y reproduce la segunda canción (demuestra el cambio de canciones)
        miReproductor.cargarCancion(cancion2);
        miReproductor.reproducir();

        // Detiene la música
        miReproductor.detener();

        // Apaga el equipo de sonido
        miEquipo.apagar();
    }
}