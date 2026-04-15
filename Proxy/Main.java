package Proxy;

public class Main {
    public static void main(String[] args) {

        Document doc1 = new DocumentProxy("contrato.pdf", "USER");
        Document doc2 = new DocumentProxy("contrato.pdf", "ADMIN");

        doc1.display(); // sin permisos
        System.out.println("----");
        doc2.display(); // carga y muestra
        System.out.println("----");
        doc2.display(); // ya no vuelve a cargar
    }
}