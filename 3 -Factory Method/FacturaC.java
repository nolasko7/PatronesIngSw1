import java.time.LocalDate;

public class FacturaC extends Factura{

    public FacturaC(int id , int documento , LocalDate fechaCreacion , float iva , float monto ){

        this.id = id;

        this.documento = documento;

        this.fechaCreacion = fechaCreacion;

        this.iva = iva;
        
        this.monto = monto;

    }

    public String imprimirDatos(){

            return"=== Factura C ===" +
            "\nId: " + id +
            "\nFecha de creacion: " + fechaCreacion +
            "\nIVA: %" + iva+ 
            "\nMonto con IVA: $" + String.format("%.2f", monto *((1 + iva)/100)) ;
        

    }





}