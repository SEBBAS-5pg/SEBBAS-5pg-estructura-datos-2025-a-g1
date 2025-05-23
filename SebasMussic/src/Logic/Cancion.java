package Logic;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSegundos;

    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracionSegundos + " segundos.");
    }
}
