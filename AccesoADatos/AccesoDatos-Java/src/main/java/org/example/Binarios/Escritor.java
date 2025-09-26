package org.example.Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Escritor {

    private static String[][] array = new String[5][5];

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        array[0][0] = "Miguel";
        array[1][0] = "José";
        array[0][1] = "18";
        array[1][1] = "21";

//        escritor(new Persona(array[0][0], Integer.valueOf(array[0][1])));
        escritor(new Persona(array[1][0], Integer.valueOf(array[1][1])));
        lector("files/FichPersona.dat");
    }

    public static void escritor(Persona persona) throws IOException {
        File f = new File("files/FichPersona.dat");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(persona);

        fos.close();
        oos.close();
    }

    public static void lector(String ruta) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        fis.close();
        ois.close();
    }
}
