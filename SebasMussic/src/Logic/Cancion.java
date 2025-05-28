// Paquete para las clases de lógica central
package Logic;

/**
 * Representa una canción con su título, artista y duración.
 */
public class Cancion {
    // Atributos (encapsulados con modificador de acceso 'private')
    private String titulo; // El título de la canción
    private String artista; // El artista de la canción
    private int duracionSegundos; // La duración de la canción en segundos

    /**
     * Constructor para inicializar un nuevo objeto Cancion.
     * @param titulo El título de la canción.
     * @param artista El artista de la canción.
     * @param duracionSegundos La duración de la canción en segundos.
     */
    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    // Métodos "getter" para permitir el acceso controlado a los atributos (encapsulamiento)

    /**
     * Obtiene el título de la canción.
     * @return El título de la canción.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el artista de la canción.
     * @return El artista de la canción.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Obtiene la duración de la canción en segundos.
     * @return La duración de la canción.
     */
    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    /**
     * Muestra los detalles de la canción en la consola.
     */
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracionSegundos + " segundos.");
    }
}