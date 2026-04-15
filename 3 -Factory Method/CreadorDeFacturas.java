import java.time.LocalDate;

public class CreadorDeFacturas {

    public static Factura crearFactura (int tipo , int id , int documento , LocalDate fechaCreacion , float iva , float monto){
            
        
        Factura nuevaFactura;

       switch (tipo) {
        case 1: 
        nuevaFactura =  new FacturaA(id, documento , fechaCreacion , iva , monto);
        return nuevaFactura;
        case 2:
        nuevaFactura =  new FacturaC(id, documento , fechaCreacion , iva , monto);
        return nuevaFactura;
        default:
        return null;
    }
    }
}
