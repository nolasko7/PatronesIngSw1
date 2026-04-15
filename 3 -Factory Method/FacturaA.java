import java.time.LocalDate;

public class FacturaA extends Factura{

    public FacturaA(int id , int documento , LocalDate fechaCreacion , float iva , float monto ){

        this.id = id;

        this.documento = documento;

        this.fechaCreacion = fechaCreacion;

        this.iva = iva;
        
        this.monto = monto;

    }

    public String imprimirDatos(){
        return"=== Factura A ===" +
        "\nId: " + id +
        "\nFecha de creacion: " + fechaCreacion +
        "\nMonto sin IVA: $" + monto +
        "\nIVA: $" + String.format("%.2f", (iva/100) * monto ) +
        "\nMonto con IVA: $" + String.format("%.2f", monto *((1 + iva)/100)) ;   
          
    }


}