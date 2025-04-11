package Logic;

    public class ProductoAlimenticio extends Producto{
        private Double descuento = 0.0;
        public void setDescuento(Double descuento){
            this.descuento = descuento;
        }
        public Double getDescuento(){
            return this.descuento;
        }
        @Override
        public Double calcularPrecioFinal(){
            return getPrecio()-(getPrecio()-descuento);
        }
        @Override
        public void mostrar(){
            System.out.println("\n"+
                    "Producto Alimenticio: "+getNombre()+"\n"+
                    "Precio Base: $"+getPrecio()+"\n"+
                    "Descuento: $"+(getDescuento()*100)+"%\n"+
                    "Precio Final: $"+calcularPrecioFinal()+"\n"
            );
        }
    }

