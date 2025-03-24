package Logic;

public abstract class Producto {
    private String Nombre;
    private Double Precio;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public Double getPrecio() {
        return this.Precio;
    }

    public abstract Double calcularPrecioFinal();

    public void mostrar() {
        System.out.println(
                "Producto: " + getNombre() + "\n" +
                        "Precio base: $" + getPrecio() + "\n" +
                        "Precio final: $" + calcularPrecioFinal() + "\n"
        );
    }
}

