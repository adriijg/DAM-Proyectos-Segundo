package org.example.Agenda.model;

public class Contacto {

    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String name, String telefono, String email) {
        this.nombre = name;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static String texto;

    @Override
    public String toString() {
        texto = String.format("""
                Nombre: %s
                Teléfono: %s
                Email: %s
                """, nombre, telefono, email);
        return "Nombre: ";
    }
}
