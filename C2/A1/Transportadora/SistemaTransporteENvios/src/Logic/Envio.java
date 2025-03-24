package Logic;

public abstract class Envio {
    private String ciudadDestino;
    private double peso;
    public void setCiudadDestino(String ciudadDestino){
        this.ciudadDestino = ciudadDestino;
    }
    public String getCiudadDestino(){
        return this.ciudadDestino;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public Double getPeso(){
        return this.peso;
    }
    public abstract double CalcularCosto();
    public void mostrar(){
        System.out.println("\n"+
            "Ciudad Destino: "+getCiudadDestino()+" Peso: "+getPeso()+"gr"+"\n"+
                "Costo Total: $"+CalcularCosto());
    }

}
