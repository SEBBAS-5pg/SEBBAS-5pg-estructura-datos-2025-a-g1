package Logic;

public class ReproductorMusica {
    private Cancion cancionActual;
    private boolean reproduciendo;

    public ReproductorMusica() {
        this.reproduciendo = false;
    }

    public void cargarCancion(Cancion cancion) {
        this.cancionActual = cancion;
        System.out.println("Canción cargada: " + cancion.getTitulo());
    }

    public void reproducir() {
        if (cancionActual != null) {
            if (!reproduciendo) {
                reproduciendo = true;
                System.out.println("Reproduciendo: " + cancionActual.getTitulo());
                cancionActual.mostrarDetalles();
            } else {
                System.out.println("Ya se está reproduciendo: " + cancionActual.getTitulo());
            }
        } else {
            System.out.println("No hay canción cargada para reproducir.");
        }
    }

    public void pausar() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Música pausada: " + cancionActual.getTitulo());
        } else {
            System.out.println("No se está reproduciendo ninguna canción para pausar.");
        }
    }

    public void detener() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Música detenida: " + cancionActual.getTitulo());
            cancionActual = null;
        } else {
            System.out.println("No se está reproduciendo ninguna canción para detener.");
        }
    }
}
