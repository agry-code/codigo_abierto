package ataque.goblin.dam;

import java.util.Random;
import java.util.Scanner;

public class FuncionesArrays {
	public static String[] generaTablero(byte tam) {
		String[] tablero = new String[tam];
		for (byte i = 0; i < tam; i++) {
			tablero[i] = "♒";
		}
		return tablero;
	}

	//Quita el contenido de esta función y conviertela en recursiva
	public static String imprimeSinMarco(String[] array, byte i) {
		String ret="";
		if(i<array.length) {
			ret+=array[i];
			ret+=FuncionesArrays.imprimeSinMarco(array, (byte) (i+1));			ret+=array[i];

		}
		
//		for(byte i=0;i<array.length;i++) {
//			ret+=array[i];
//		}
		return ret;
	}
	
	
	public static String imprime(String[] array) {
		Random r = new Random();
		String ret = "";
		String[] simbolos = { "♨", "🍙", "🏞", "🌀" };
		for (byte i = 0; i < array.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		ret += "\n";
		ret += simbolos[r.nextInt(simbolos.length)];
		for (byte i = 0; i < array.length; i++) {
			ret += array[i];
		}
		ret += simbolos[r.nextInt(simbolos.length)];
		ret += "\n";
		for (byte i = 0; i < array.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		return ret;
	}

	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println(
				"Bienvenid" + Funciones.terminacionGenero(generoJugador, false) + " al Ataque de los Goblin en 1D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño del tablero (4-127)");
		byte tamaño = Byte.parseByte(sc.nextLine());
		String[] tablero = FuncionesArrays.generaTablero(tamaño);
		// 👩 👨 웃
		String iconoJugador = (generoJugador == 'm' ? "👨" : generoJugador == 'f' ? "👩" : "웃");
		// En la primera posición coloco el jugador
		byte posicionJugador = 0;
		tablero[posicionJugador] = iconoJugador;
		// El último tercio del tablero, lo relleno de goblins
		for (byte i = (byte) (tablero.length - 1); i > (tablero.length - 1) * 2 / 3; i--) {
			tablero[i] = "👺";
		}
		// Usa intercambia para intercambiar 1000 veces dos
		// posiciones aleatorias del array
		Random r = new Random();
		for (short i = 0; i < 1000; i++) {
			intercambia(tablero, (byte) r.nextInt(tablero.length),
					(byte) r.nextInt(tablero.length));
		}
		System.out.println(FuncionesArrays.imprime(tablero));
		System.out.println();
		System.out.println(FuncionesArrays.imprimeSinMarco(tablero, (byte)0));

	}

	// Que intercambie en el array lo que hay en array[p1] por lo que hay
	// en array[p2]
	public static void intercambia(String[] array, byte p1, byte p2) {
		String aux = array[p1];
		array[p1] = array[p2];
		array[p2] = aux;

	}

}
