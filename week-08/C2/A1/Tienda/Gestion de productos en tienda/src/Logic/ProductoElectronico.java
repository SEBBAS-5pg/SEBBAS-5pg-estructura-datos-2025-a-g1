package Logic;

public class ProductoElectronico extends Producto {
    private double impuestoElectronico = 0.0;

    public void setImpuestoElectronico(double impuestoElectronico) {
        this.impuestoElectronico = impuestoElectronico;
    }
    public Double getImpuestoelectronico(){
        return this.impuestoElectronico;
    }
    @Override
    public Double calcularPrecioFinal(){
        return getPrecio()+(getPrecio()*impuestoElectronico);
    }
    @Override
    public void mostrar(){
        System.out.println("\n"+
                "Producto Electronico: "+getNombre()+"\n"+
                        "Precio base: $"+getPrecio()+"\n"+
                        "Impuesto Electrodomesticos: $"+(getImpuestoelectronico()*100)+"%\n"+
                        "Precio final: $"+calcularPrecioFinal()
        );;
    }
}