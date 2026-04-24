public class Arbol{

    private int x, y ;

    TipoArbol tipo ; 

    public Arbol(int x , int y , TipoArbol tipo){

        this.x = x;

        this.y = y;

        this.tipo = tipo;
    }

    public void creacion(){
        tipo.dibujar(x, y);
    }

}