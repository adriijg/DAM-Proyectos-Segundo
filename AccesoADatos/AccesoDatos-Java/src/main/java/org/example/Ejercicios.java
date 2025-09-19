package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args) {
//        System.out.println(ejercicio1());
//        System.out.println(ejercicio2());
//        ejercicio3();
        ejercicio4B();
    }

    private static String ejercicio1(String[] args) {
        String dirName = args[0]; //"files";
        File f = new File(dirName);
        String texto = "";
        if (f.exists() && f.isDirectory()) {
            String[] array = f.list();
            if (array.length > 0 && array != null){
                texto = "Estos son los ficheros de la carpeta " + dirName + ": " + Arrays.toString(array);
            } else {
                texto = "No hay ficheros en el directorio";
            }
        } else {
            texto = "El directorio al que haces referencia no existe";
        }
        return texto;
    }

    private static String ejercicio2() {
        String dirName = "files/Fichero.txt";
//        String dirName = "files";
        File f = new File(dirName);
        String texto = "";
        if (f.exists()) {
            String nombre = String.format("Nombre: %s", f.getName());
            String ruta = String.format("Ruta: %s", f.getPath());
            String rutaAbs = String.format("Ruta Absoluta: %s", f.getAbsolutePath());
            String escribible = "";
            if (f.canWrite()) {
                escribible = "Se puede escribir";
            } else {
                escribible = "No se puede escribir";
            }

            String leible = "";
            if (f.canRead()) {
                leible = "Se puede leer";
            } else {
                leible = "No se puede leer";
            }
            String tamanio = String.format("Tamaño: %s", f.length());
            String tipo = "";
            if (f.isDirectory()) {
                tipo = "Es un directorio";
            } else if (f.isFile()) {
                tipo = "Es un fichero";
            } else {
                tipo = "Se desconoce el tipo";
            }
            texto = String.format("""
                %s
                %s
                %s
                %s
                %s
                %s
                %s
                """, nombre, ruta, rutaAbs, escribible, leible, tamanio, tipo);
        }
        return texto;
    }

    private static void ejercicio3() {
        File f = new File("files/NUEVODIR_AJG");

        if (f.mkdir()){
            System.out.printf("MKDIR: %s", f.getPath());
        } else {
            System.out.println("Error de creación.");
        }

        File f1 = new File(f, "fic1.txt");
        File f2 = new File(f, "fic2.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println(f1.getName());
            }

            if (f2.createNewFile()) {
                System.out.println(f2.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (f2.renameTo(new File(f, "ficheroREN"))){
            System.out.println("Renombrado");
        } else {
            System.out.println("Error");
        }

        if (f2.delete()) {
            System.out.println("Eliminado");
        } else {
            System.out.println("No eliminado");
        }
    }

    private static void ejercicio4() {
        String fName = "src/main/java/org/example/Ejercicios.java";
        File f = new File(fName);

        try (FileReader fr = new FileReader(f)) {
            int dato;

            while ((dato = fr.read()) != -1) {
                char c = (char) dato;
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.err.println("Final");
    }

    private static void ejercicio4B() {
        String fName = "src/main/java/org/example/Ejercicios.java";
        File f = new File(fName);

        try (FileReader fr = new FileReader(f)) {
            StringBuilder bloque = new StringBuilder();
            int dato;
            String texto = "";

            while ((dato = fr.read()) != -1) {
                char c = (char) dato;
                bloque.append(c);

                if (bloque.length() == 30) {
                    System.out.println(bloque.toString());
                    bloque.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}