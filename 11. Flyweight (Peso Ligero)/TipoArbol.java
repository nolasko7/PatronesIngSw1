public class TipoArbol {

    private String nombre;

    private String color;

    private String nacionalidad;


    public TipoArbol(String nombre, String color, String nacionalidad){

        this.nombre = nombre;

        this.color = color ;

        this.nacionalidad = nacionalidad;

    }


    public void dibujar(int x , int y){

        System.out.println("Dibujando arbol en la coordenada x:" + x + " y:"+ y );
    }




}