package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Markdown {
    public static void main(String[] args) {
        // Nombre del archivo
        String fileName = "ejemplo.md";

        // Contenido Markdown
        String contenido = """
                # Mi primer Markdown generado en Java
                
                Este archivo fue creado automaticamente usando **Java**.
                
                ## Lista de cosas:
                - Elemento 1
                - Elemento 2
                - Elemento 3
                
                ## Tabla de ejemplo:
                | Nombre | Edad |
                |--------|------|
                | Juan   | 20   |
                | María  | 25   |
                """;

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hola");
        map.put(2, "Adios");

        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(contenido);
            System.out.println("Fichero generado con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
