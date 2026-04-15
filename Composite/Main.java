package Composite;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("foto.jpg", 500);
        File file2 = new File("video.mp4", 1500);
        File file3 = new File("documento.pdf", 300);

        Folder folder1 = new Folder("Mis archivos");
        Folder folder2 = new Folder("Videos");

        folder2.add(file2);
        folder1.add(file1);
        folder1.add(file3);
        folder1.add(folder2); // 📁 carpeta dentro de carpeta

        folder1.showDetails();

        System.out.println("Tamaño total: " + folder1.getSize() + " KB");
    }
}