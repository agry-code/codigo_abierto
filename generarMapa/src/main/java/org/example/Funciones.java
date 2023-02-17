package org.example;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
    public static short pideNumero(String msg, byte minimo, short maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        short numero = Short.parseShort(sc.nextLine());
        if (numero < minimo || numero > maximo) {
            return pideNumero(msg, minimo, maximo);
        }
        return numero;
    }

    public static char[][] matrizDeAguau(byte nFilas, byte nColumnas) {
        char[][] matriz = new char[nFilas][nColumnas];
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '~';
            }
        }
        return matriz;
    }

    public static void ponerTerreno(char[][] matriz, short nContinentes) {
        Random r = new Random();
        for (short i = 0; i < nContinentes; i++) {
            byte fila;
            byte columna;
            do {
                fila = (byte) r.nextInt(matriz.length);
                columna = (byte) r.nextInt(matriz.length);
            } while (matriz[fila][columna] != '~');
            matriz[fila][columna] = '#';
        }
    }

    public static String imprimir(char[][] matriz) {
        String ret = "";
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz.length; j++) {
                ret += matriz[i][j];
                ret += "\t";
            }
            ret += "\n";
        }
        return ret;
    }

    public static void extenderTerrerno(char[][] matriz) {
        Random r = new Random();
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
//                boolean pongoPorCiento = (r.nextInt(10) < 4);
                if (matriz[i][j] == '#') {
                    if (i > 0 && j > 0 && matriz[i - 1][j - 1] != '#') {//diagonal izqierda arriba
                        boolean pongoPorCiento = (r.nextInt(100) < 40);
                        if (pongoPorCiento) {
                            matriz[i - 1][j - 1] = '%';
                        }
                    }
                    if (i > 0 && matriz[i - 1][j] != '#') {//arriba
                        boolean pongoPorCiento = (r.nextInt(100) < 40);
                        if (pongoPorCiento) {
                            matriz[i - 1][j] = '%';
                        }
                    }
                    if (j < matriz[i].length - 1 && i > 0 && matriz[i - 1][j + 1] != '#') {//diagonal derecha arriba
                        boolean pongoPorCiento = (r.nextInt(100) < 40);
                        if (pongoPorCiento) {
                            matriz[i - 1][j + 1] = '%';
                        }
                    }
                    if (j > 0 && matriz[i][j - 1] != '#') {//izquierda
                        matriz[i][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j - 1]);

                    }
                    if (j < matriz[i].length - 1 && matriz[i][j + 1] != '#') {//derecha
                        matriz[i][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1 && matriz[i + 1][j] != '#') {//abajo
                        matriz[i + 1][j] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j]);

                    }
                    if (i < matriz.length - 1 && j < matriz[i].length - 1 && matriz[i + 1][j + 1] != '#') {//diagonal derecha abajo
                        matriz[i + 1][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j + 1]);

                    }
                    if (i < matriz.length - 1 && j > 0 && matriz[i + 1][j - 1] != '#') {// diagonal izquierda abajo
                        matriz[i + 1][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j - 1]);

                    }
                }
            }
        }
        for (byte i = 0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == '%') {
                    matriz[i][j] = '#';
                }
            }
        }
    }

}
