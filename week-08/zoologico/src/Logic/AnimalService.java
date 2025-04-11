package Logic;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    private List<Animal> animales = new ArrayList<>();
    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }
    public void mostrarAcciiones(){
        for(Animal a : animeales){
            System.out.println("Nombre "+a.getNombre());
            a.comer();
            a.dormir();
            a.desplazarse();
        }
    }
}
