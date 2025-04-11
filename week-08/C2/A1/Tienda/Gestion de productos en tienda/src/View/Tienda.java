package View;
import Logic.*;

public class Tienda {
    public static void main(String[] args){
      System.out.println("TIENDA DE TODE\n");
      ProductoAlimenticio arroz = new ProductoAlimenticio();
      arroz.setNombre("Arroz Roa 100gr");
      arroz.setPrecio(5000.0);
      arroz.setDescuento(0.02);

      ProductoElectronico licuadora = new ProductoElectronico();
      licuadora.setPrecio(2000000.0);
      licuadora.setNombre("Licuadora Ninja");
      licuadora.setImpuestoElectronico(0.03);

      ProductoFarmaceutico loratadina = new ProductoFarmaceutico();
      loratadina.setNombre("Loratadina 50gr");
      loratadina.setPrecio(100000.0);
      loratadina.setImpuestoFarmaceutico(0.03);

      ProductoRopa vestido = new ProductoRopa();
      vestido.setNombre("Vestido de Baño");
      vestido.setPrecio(40000.0);
      vestido.setImpuestoRopa(0.05);

      arroz.mostrar();
      loratadina.mostrar();
      licuadora.mostrar();
      vestido.mostrar();
    }
}
