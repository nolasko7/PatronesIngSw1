import java.util.List;
import java.util.ArrayList;


public class main{
    public static void  main(String[] args) {

    FlyweightFactory listaDeArboles = new FlyweightFactory();


    List <Arbol> bosque = new ArrayList<>();
    
    TipoArbol tipo;

    Arbol arbolito1;

    tipo = listaDeArboles.obtener("Roble", "Marron" ,"Rocosa");

    arbolito1 = new Arbol( ((int) Math.random()*1000) ,  ((int)Math.random()*1000) ,tipo);
    
    for(int i = 0 ; i<1000 ; i++){

        arbolito1 = new Arbol( i*i ,  i*3 ,tipo);

        arbolito1.creacion();

        bosque.add(arbolito1);
    
    }
        
    }




}