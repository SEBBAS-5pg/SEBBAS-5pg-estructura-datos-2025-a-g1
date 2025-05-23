package Logic;

public class EquipoSonido {
    private String marca;
    private String modelo;
    private boolean encendido;

    public EquipoSonido(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println(marca + " " + modelo + " encendido.");
        } else {
            System.out.println(marca + " " + modelo + " ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println(marca + " " + modelo + " apagado.");
        } else {
            System.out.println(marca + " " + modelo + " ya está apagado.");
        }
    }
}
