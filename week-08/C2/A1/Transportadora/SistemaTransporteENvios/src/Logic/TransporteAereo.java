package Logic;

import org.w3c.dom.ls.LSOutput;

public class TransporteAereo extends Envio{
    private static double PrecioXpeso = 120000.0;
    public Double getPrecioXpeso(){
        return PrecioXpeso;
    }
    @Override
    public double CalcularCosto(){
        return getPeso()*PrecioXpeso;
    }
    @Override
    public void mostrar(){
        System.out.println("\n"+
                "Ciudad Destino: "+getCiudadDestino()+" Peso: "+getPeso()+"gr\n"+
                "Precio por Peso: $"+getPrecioXpeso()+"\n"+
                "Costo de Envio: $"+CalcularCosto()
        );
    }

}
