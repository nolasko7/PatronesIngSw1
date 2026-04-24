import java.util.*;

class FlyweightFactory {


    Map<String, TipoArbol> tiposDeArboles = new HashMap<>();


    public TipoArbol obtener(String nombre, String color, String textura) {

        if (!tiposDeArboles.containsKey(nombre)) {
            tiposDeArboles.put(nombre, new TipoArbol(nombre, color, textura));
            System.out.println("Creando nuevo tipo: " + nombre);

        } 
        
        
        else {
            System.out.println("Reutilizando tipo: " + nombre);
        }


        return tiposDeArboles.get(nombre);  // devuelve la referencia, no una copia
    }
}