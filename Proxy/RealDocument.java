package Proxy;

public class RealDocument implements Document {

    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // simulamos carga pesada
    }

    private void loadFromDisk() {
        System.out.println("Cargando documento desde disco: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Mostrando documento: " + fileName);
    }
}