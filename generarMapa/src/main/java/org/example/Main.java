package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte filas = -1;
        byte columnas = -1;
        for (byte i = 0; i < args.length; i++) {
            if (args[i].equals("-filas")) {
                filas = Byte.parseByte(args[i + 1]);
                //String args[i+1], para un char args[i+1].charAt(0) y para un boolean if(args[i+1].equals("true"){})
            }
            if (args[i].equals("-columnas")) {
                columnas = Byte.parseByte(args[i + 1]);
            }
        }
        if (filas < 10 || filas > 126) {
            filas = (byte) Funciones.pideNumero("Dime el numero de filas (10-127)", (byte) 10, (byte) 127);
        }
        if (columnas < 10 || columnas > 126) {
            columnas = (byte) Funciones.pideNumero("Dime el numero de columnas (10-127)", (byte) 10, (byte) 127);
        }
        char[][] tablero = Funciones.matrizDeAguau(filas, columnas);
        short nContinente = Funciones.pideNumero("Dime el numero de continentes (1 - " + (filas * columnas) + ")", (byte) 1, (short) (filas * columnas));
        Funciones.ponerTerreno(tablero, nContinente);
        Funciones.imprimir(tablero);
        byte extensionMax = (byte) Funciones.pideNumero("Dime la extension maxima de los continentes(2 - 5)", (byte) 2, (byte) 5);
        System.out.println(Funciones.imprimir(tablero));
        for (byte i = 0; i < extensionMax; i++) {
            Funciones.extenderTerrerno(tablero);
        }
        System.out.println(Funciones.imprimir(tablero));
    }
}