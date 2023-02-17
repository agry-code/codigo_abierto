package org.example;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
    public static byte pideNumeroEntre(String msg, byte min, byte max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        byte numero = Byte.parseByte(sc.nextLine());
        if (numero < min || numero > max) {
            return pideNumeroEntre(msg, min, max);
        }
        return numero;
    }

    public static char[] creaTablero(byte tamanio) {
        char[] tablero = new char[tamanio];
        for (byte i = 0; i < tablero.length; i++) {
            tablero[i] = '_';
        }
        return tablero;
    }

    public static String imprimeArrayBonico(char[] frente, char[] fondo) {
        String ret = "| ";
        for (byte i = 0; i < frente.length; i++) {
            if (frente[i] != '_') {
                ret += frente[i] + "\t";
            } else { //
                ret += fondo[i] + "\t";
            }
        }
        ret += "|\n  ";
        for (byte i = 0; i < frente.length; i++) {
            ret += i + "\t";
        }
        return ret;
    }

    public static byte colocaAleatoriamente(char[] destino, char caracter) {
        Random r = new Random();
        byte posicion = (byte) r.nextInt(destino.length);
        if (destino[posicion] != '_') {
            return colocaAleatoriamente(destino, caracter);
        }
        destino[posicion] = caracter;
        return posicion;
    }

    public static byte moverElemento(char[] tablero, char asesino, byte numero, byte posicion) {
        if (asesino == '♂' && tablero[posicion] == '♀') {
            tablero[posicion] = '♀';
        } else {
            tablero[posicion] = '_';
        }
        if (numero == -1) {
            if (posicion != 0) {
                posicion--;
            } else {//Tratamiento especial para el caso extremo
                posicion = (byte) (tablero.length - 1);
            }
        }
        if (numero == 1) {
            if (posicion != tablero.length - 1) {
                posicion++;
            } else {//Tratamiento especial para el caso extremo
                posicion = 0;
            }
        }
        tablero[posicion] = asesino;
        return posicion;
    }

}
