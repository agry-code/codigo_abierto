package org.example;

import java.util.Random;

public class Funciones {
    public static char[][] creaSopa(byte nf, byte nc) {
        char[][] matriz = new char[nf][nc];
        Random r = new Random();
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) r.nextInt('a', ('z' + 1));
            }
        }
        return matriz;
    }

    public static String imprimeMatriz(char[][] matriz) {
        String ret = "";
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                ret += matriz[i][j] + " ";
            }
            ret += "\n";
        }
        return ret;
    }

    public static boolean insertaPalabra
            (char[][] matriz, String palabra, byte fil, byte col) {
        if (col + palabra.length() - 1 < matriz[fil].length) {
            for (byte i = 0; i < palabra.length(); i++) {
                matriz[fil][col + i] = palabra.charAt(i);
            }
            return true;
        }
        return false;
    }

}
