package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generación de la matriz
        System.out.println("¿De cuántas filas quieres la sopa?");
        byte nFilas = Byte.parseByte(sc.nextLine());
        System.out.println("¿De cuántas columnas quieres la sopa?");
        byte nColumnas = Byte.parseByte(sc.nextLine());
        char[][] sopa = Funciones.creaSopa(nFilas, nColumnas);
        //inserción de la palabra
        boolean puedoSeguir = false;
        do {
            System.out.println("Dime una palabra que quieras insertar en la sopa");
            String palabra = sc.nextLine();
            System.out.println("Dime la fila donde quieres insertar la palabra");
            byte filaInsercion = Byte.parseByte(sc.nextLine());
            System.out.println("Dime la columna donde quieres insertar la palabra");
            byte columnaInsercion = Byte.parseByte(sc.nextLine());
            puedoSeguir = Funciones.insertaPalabra(sopa, palabra, filaInsercion, columnaInsercion);
            if (!puedoSeguir) {
                System.out.println("La palabra no cabe ahí. Escribe otra cosa");
            }
        } while (!puedoSeguir);

        //Imprimimos la matriz
        System.out.println(Funciones.imprimeMatriz(sopa));

    }
}