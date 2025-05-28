// Paquete para las clases de lógica central
package Logic;

/**
 * Representa un equipo de sonido con funcionalidades básicas como encender/apagar.
 */
public class EquipoSonido {
    // Atributos (encapsulados)
    private String marca; // La marca del equipo de sonido
    private String modelo; // El modelo del equipo de sonido
    private boolean encendido; // Estado actual del equipo (true si está encendido, false si está apagado)

    /**
     * Constructor para inicializar un nuevo objeto EquipoSonido.
     * Inicialmente, el equipo de sonido está apagado.
     * @param marca La marca del equipo de sonido.
     * @param modelo El modelo del equipo de sonido.
     */
    public EquipoSonido(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false; // Por defecto, el equipo de sonido está apagado
    }

    // Métodos "getter" para acceder a los atributos (encapsulamiento)

    /**
     * Obtiene la marca del equipo de sonido.
     * @return La marca del equipo de sonido.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del equipo de sonido.
     * @return El modelo del equipo de sonido.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Verifica si el equipo de sonido está encendido.
     * @return true si el equipo de sonido está encendido, false en caso contrario.
     */
    public boolean estaEncendido() {
        return encendido;
    }

    // Métodos para la funcionalidad del equipo de sonido

    /**
     * Enciende el equipo de sonido.
     * Si ya está encendido, imprime un mensaje indicándolo.
     */
    public void encender() {
        if (!encendido) { // Verifica si el equipo de sonido está actualmente apagado
            encendido = true; // Lo enciende
            System.out.println(marca + " " + modelo + " encendido.");
        } else {
            System.out.println(marca + " " + modelo + " ya está encendido.");
        }
    }

    /**
     * Apaga el equipo de sonido.
     * Si ya está apagado, imprime un mensaje indicándolo.
     */
    public void apagar() {
        if (encendido) { // Verifica si el equipo de sonido está actualmente encendido
            encendido = false; // Lo apaga
            System.out.println(marca + " " + modelo + " apagado.");
        } else {
            System.out.println(marca + " " + modelo + " ya está apagado.");
        }
    }
}