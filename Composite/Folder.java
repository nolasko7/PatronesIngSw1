package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Carpeta: " + name);

        for (FileSystemComponent component : children) {
            component.showDetails(); // 🔁 recursividad
        }
    }

    @Override
    public int getSize() {
        int total = 0;

        for (FileSystemComponent component : children) {
            total += component.getSize(); // 🔁 suma recursiva
        }

        return total;
    }
}