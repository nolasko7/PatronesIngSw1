package Composite;

public class File implements FileSystemComponent {

    private String name;
    private int size; // en KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}