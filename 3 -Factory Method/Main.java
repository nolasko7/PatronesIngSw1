import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main{




    public static void main(String[] args){

        List<Factura> facturasA = new ArrayList<>();
        List<Factura> facturasB = new ArrayList<>();

        facturasA.add(CreadorDeFacturas.crearFactura(1, 12 , 44480556, LocalDate.of(2001,10,1), 21f , 1231231f));
        facturasA.add(CreadorDeFacturas.crearFactura(1, 3 , 44436, LocalDate.of(2021,5,2), 21f , 1233f));
        facturasA.add(CreadorDeFacturas.crearFactura(1, 6 , 441556, LocalDate.of(2013,10,1), 21f , 213410f));
        

        facturasB.add(CreadorDeFacturas.crearFactura(2, 123 , 444330556, LocalDate.of(2023,4,6), 21f , 203213120f));
        facturasB.add(CreadorDeFacturas.crearFactura(2, 12213 , 444523556, LocalDate.of(2023,3,5), 21f , 202310f));
        facturasB.add(CreadorDeFacturas.crearFactura(2, 122333 , 1213, LocalDate.of(2022,4,2), 21f , 202323f));

        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Facturas tipo A");
        for (Factura iterador : facturasA ) {

            System.out.println("ID " + iterador.getId());
            
        }
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Facturas tipo B");
        for (Factura iterador : facturasB ) {

            System.out.println("ID " + iterador.getId());
            
        }
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Buscando facturas");
        System.out.print("\n");
        System.out.print("\n");

        for (Factura iterador : facturasA ) {

            if(iterador.getId() == 6 ){
                System.out.println(iterador.imprimirDatos());
            }
            
        }
        System.out.print("\n");
        System.out.print("\n");

        for (Factura iterador : facturasB ) {

            if(iterador.getId() == 122333 ){
                System.out.println(iterador.imprimirDatos());
            }
            
        }





    }
}