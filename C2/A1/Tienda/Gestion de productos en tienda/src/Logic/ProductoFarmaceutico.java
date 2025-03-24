package Logic;

public class ProductoFarmaceutico extends Producto{
    private Double impuestoFarmaceutico = 0.0;

    public void setImpuestoFarmaceutico(Double impuestoFarmaceutico) {
        this.impuestoFarmaceutico = impuestoFarmaceutico;
    }

    public Double getImpuestoFarmaceutico(){
        return this.impuestoFarmaceutico;
    }
    @Override
    public Double calcularPrecioFinal(){
        return getPrecio()*getImpuestoFarmaceutico();
    }
    @Override
    public void mostrar(){
        System.out.println("\n"+
                "Producto Farmaceutico: "+getNombre()+"\n"+
                "Precio base: $"+getPrecio()+"\n"+
                "Impuesto Farmaceutico: "+getImpuestoFarmaceutico()*100+"%\n"+
                "Precio Final: $"+calcularPrecioFinal()
        );
    }
}


