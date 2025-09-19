package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        String producto = "producto";
        double precio = 1.2;
        String cadena = String.format("El producto: %s, tiene un precio de %.2f €", producto, precio);
        System.out.println(cadena);
    }
}