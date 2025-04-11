package Logic;

public class ProductoRopa extends Producto{
    private Double impuestoRopa = 0.0;
    public void setImpuestoRopa(Double impuestoRopa){
        this.impuestoRopa=impuestoRopa;
    }
    public Double getImpuestoRopa(){
        return this.impuestoRopa;
    }
    @Override
    public Double calcularPrecioFinal(){
        return getPrecio()+(getPrecio()*getImpuestoRopa());
    }
    @Override
    public void mostrar(){
        System.out.println("\n"+
                "Producto Ropa: "+getNombre()+"\n"+
                "Precio base: $"+getPrecio()+"\n"+
                "Impuesto Moda: "+getImpuestoRopa()*100+"%\n"+
                "Precio FInal: $"+calcularPrecioFinal()
        );
    }
}