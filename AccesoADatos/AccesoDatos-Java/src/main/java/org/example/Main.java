package org.example;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ficheros();
    }

    private static void ficheros() {
//        File f = new File ("../src/main/java/org/example/Fichero.txt");
        File f = new File("files/Fichero.txt");
        f.getParentFile().mkdirs(); // crea la carpeta "files" si no existe

        try (FileWriter fw = new FileWriter(f)) {
            fw.write("Hola mundo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}