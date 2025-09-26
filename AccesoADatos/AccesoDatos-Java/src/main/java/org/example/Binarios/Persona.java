package org.example.Binarios;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String devolver = String.format( """
                Nombre = %s
                Edad = %s
                """, nombre, edad);
        return devolver;
    }
}
