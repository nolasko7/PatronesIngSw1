import java.time.LocalDate;


public abstract class Factura {

    private int contraseña =123; 

    protected int id ;

    protected int documento;

    protected LocalDate fechaCreacion;

    protected float iva ;

    protected float monto ; 


    public abstract String imprimirDatos();


    public int getContraseña() {
        return contraseña;
    }

    public int getId() {
        return id;
    }

    
    



    
    
    
    
}