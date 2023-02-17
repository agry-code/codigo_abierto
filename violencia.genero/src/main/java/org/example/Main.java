package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\\\\||~~Violencia de género~~||//");
        System.out.println("¿Cuántas victimas se cobrará el patriarcado?");
        byte objetivoMuerte = Byte.parseByte(sc.nextLine());
        //Variables
        byte muertesConseguidas = 0;
        int nTurno = 0;
        boolean stuck = false;
        char teclaIzda = '.';
        char teclaDcha = '-';
        for (byte i = 0; i < args.length; i++) {
            // Mis argumentos van a ser: -teclaIzda a -teclaDcha d
            //Parece ser que al enviarlo no se guardan los argumentos así que los pide por teclado, tal y como dice el enunciado del ejercicio
            if (args[i].equals("-teclaIzda")) {

                teclaIzda = (args[i + 1]).charAt(0);
            }
            if (args[i].equals("-teclaDcha")) {
                teclaDcha = (args[i + 1]).charAt(0);
            }
        }
        if (teclaIzda == '.') {
            System.out.println("¿Que tecla quieres para moverte a la izquierda?");
            teclaIzda = sc.nextLine().charAt(0);
        }
        if (teclaDcha == '-') {
            System.out.println("¿Que tecla quieres para moverte a la derecha?");
            teclaDcha = sc.nextLine().charAt(0);
        }
        byte tamanio = Funciones.pideNumeroEntre("Elige un tamaño del tablero: (entre 5 o 15)", (byte) 5, (byte) 15);
        char[] tablero = Funciones.creaTablero(tamanio);
        char[] tumba = Funciones.creaTablero(tamanio);
        byte man = Funciones.colocaAleatoriamente(tablero, '♂');
        byte women = Funciones.colocaAleatoriamente(tablero, '♀');
        System.out.println(Funciones.imprimeArrayBonico(tablero, tumba));
        for (nTurno = 0; muertesConseguidas < objetivoMuerte; nTurno++) {


            //Primera parte del bucle: Pedir entradas
            System.out.println("¿Donde te quieres mover? (Izquierda - " + teclaIzda + " / Derecha - " + teclaDcha + ")");
            char teclaPulsada = sc.nextLine().charAt(0);
            //Segunda parte del bucle de juego: Mover y calcular consecuencias:
            //Para realizar el cambio debo borrar al personaje, cambio la posicion y pinto en la nueva posicion
            if (teclaPulsada == teclaIzda) {
                man = Funciones.moverElemento(tablero, '♂', (byte) -1, man);
            }
            if (teclaPulsada == teclaDcha) {
                man = Funciones.moverElemento(tablero, '♂', (byte) 1, man);
            }
            if (!((objetivoMuerte / 2) <= muertesConseguidas)) {
                if (man != women) {
                    women = Funciones.moverElemento(tablero, '♀', (byte) (r.nextBoolean() ? -1 : 1), women);
                    if (man == women) {
                        tablero[man] = '♂';
                    }
                }
            } else {
                if ('☗' == tumba[women] && (!stuck)) {
                    stuck = true;
                    System.out.println("La victima se ha quedado impactada por la tumba y no se podrá mover durante un turno.");
                } else {
                    stuck = false;
                    if (man != women) {
                        women = Funciones.moverElemento(tablero, '♀', (byte) (teclaPulsada == teclaIzda ? -1 : 1), women);
                        if (man == women) {
                            tablero[man] = '♂';
                        }
                    }
                }

            }
            if (man == women) {
                tablero[man] = '♂';

                //Si la posicion de man es igual a mujer, cuento una muerte
                if (man == women) {
                    muertesConseguidas++;
                    tumba[women] = '☗';
                    if (muertesConseguidas == objetivoMuerte) {
                        break;
                        //Si he conseguido mi objetivo de muerte pues salimos
                    }
                    women = Funciones.colocaAleatoriamente(tablero, '♀');
                }
            }
            //Tercera parte del bucle del juego: Dibujar siguiente frame
            System.out.println("Machista nivel: " + muertesConseguidas);
            System.out.println(Funciones.imprimeArrayBonico(tablero, tumba));
        }
        //Final de partida, imprimir resumen.
        System.out.println("GAME OVER");
        System.out.println("La violencia de género se ha llevado a " + muertesConseguidas
                + " mujeres.");
        System.out.println("Durante " + nTurno + " dias, en un " + tablero.length + " ciudades españolas distintas.");
    }
}