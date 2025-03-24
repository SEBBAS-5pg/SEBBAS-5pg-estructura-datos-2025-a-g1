package Logic;

public class TransporteTerrestre extends Envio{
    private static double PrecioXpeso = 60000.0;
    public double getPrecioXpeso(){
        return this.PrecioXpeso;
    }
    @Override
    public double CalcularCosto(){
        return getPeso()*PrecioXpeso;
    }
    @Override
    public void mostrar(){
        System.out.println("\n"+
                "Ciudad Destino: "+getCiudadDestino()+" Peso: "+getPeso()+"\n"+
                "Precio por Peso: $"+getPrecioXpeso()+"\n"+
                "Costo Envio: $"+CalcularCosto());
    }
}
