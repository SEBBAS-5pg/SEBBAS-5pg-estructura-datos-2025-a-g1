package Logic;

public class Burro extends Animal{
    private String colorPleaj;

    public Burro(String nombre, int edad, float peso, String colorPleaj) {
        super(nombre, edad, peso);
        this.colorPleaj = colorPleaj;
    }

    public String getColorPleaj() {
        return colorPleaj;
    }

    public void setColorPleaj(String colorPleaj) {
        this.colorPleaj = colorPleaj;
    }
    @Override
    public void comer(){
        System.out.println("Soy un burro y estpy comiendo pasto.");
    }
    @Override
    public void dormir(){
        System.out.println("Estoy durmiendo bajo un arbol.");
    }
    @Override
    public void desplazarse(){
        System.out.println("Estoy caminando lentamente.");
    }
}
