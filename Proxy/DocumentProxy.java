package Proxy;

public class DocumentProxy implements Document {

    private String fileName;
    private RealDocument realDocument;
    private String userRole;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display() {

        // 🔐 Control de acceso
        if (!userRole.equals("ADMIN")) {
            System.out.println("Acceso denegado para el usuario con rol: " + userRole);
            return;
        }

        // ⚡ Lazy loading
        if (realDocument == null) {
            realDocument = new RealDocument(fileName);
        }

        // Delegación al objeto real
        realDocument.display();
    }
}