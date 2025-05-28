// Paquete para las clases de lógica central
package Logic;

/**
 * Representa un reproductor de música que puede cargar, reproducir, pausar y detener canciones.
 */
public class ReproductorMusica {
    // Atributos (encapsulados)
    private Cancion cancionActual; // La canción actualmente cargada en el reproductor
    private boolean reproduciendo; // Estado de reproducción actual (true si está reproduciendo, false si está pausado o detenido)

    /**
     * Constructor para inicializar un nuevo objeto ReproductorMusica.
     * Inicialmente, no hay ninguna canción reproduciéndose.
     */
    public ReproductorMusica() {
        this.reproduciendo = false; // Por defecto, no hay ninguna canción reproduciéndose
    }

    // Métodos para las funcionalidades del reproductor de música

    /**
     * Carga una canción especificada en el reproductor.
     * @param cancion La canción a cargar.
     */
    public void cargarCancion(Cancion cancion) {
        this.cancionActual = cancion; // Establece la canción actual
        System.out.println("Canción cargada: " + cancion.getTitulo());
    }

    /**
     * Comienza a reproducir la canción actualmente cargada.
     * Si no hay ninguna canción cargada o si ya se está reproduciendo, imprime un mensaje apropiado.
     */
    public void reproducir() {
        if (cancionActual != null) { // Verifica si hay una canción cargada
            if (!reproduciendo) { // Verifica si no se está reproduciendo ya
                reproduciendo = true; // Comienza a reproducir
                System.out.println("Reproduciendo: " + cancionActual.getTitulo());
                cancionActual.mostrarDetalles(); // Muestra los detalles de la canción
            } else {
                System.out.println("Ya se está reproduciendo: " + cancionActual.getTitulo());
            }
        } else {
            System.out.println("No hay canción cargada para reproducir.");
        }
    }

    /**
     * Pausa la canción que se está reproduciendo actualmente.
     * Si no hay ninguna canción reproduciéndose, imprime un mensaje apropiado.
     */
    public void pausar() {
        if (reproduciendo) { // Verifica si hay una canción reproduciéndose actualmente
            reproduciendo = false; // Pausa la canción
            System.out.println("Música pausada: " + cancionActual.getTitulo());
        } else {
            System.out.println("No se está reproduciendo ninguna canción para pausar.");
        }
    }

    /**
     * Detiene la canción que se está reproduciendo actualmente y la descarga del reproductor.
     * Si no hay ninguna canción reproduciéndose, imprime un mensaje apropiado.
     */
    public void detener() {
        if (reproduciendo) { // Verifica si hay una canción reproduciéndose actualmente
            reproduciendo = false; // Detiene la reproducción
            System.out.println("Música detenida: " + cancionActual.getTitulo());
            cancionActual = null; // Descarga la canción (establece como nula)
        } else {
            System.out.println("No se está reproduciendo ninguna canción para detener.");
        }
    }
}