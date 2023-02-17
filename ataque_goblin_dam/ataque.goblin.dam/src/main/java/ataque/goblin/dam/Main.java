package ataque.goblin.dam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char generoJugador = ' ';
		String nombreJugador = null;

		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-g")) {
				generoJugador = args[i + 1].charAt(0);
			} // if
			if (args[i].equals("-n")) {
				nombreJugador = args[i + 1];
			} // if
		} // for

		if (generoJugador != 'm' && generoJugador != 'f' && generoJugador != 'n') {
			generoJugador = Funciones.darGenero();
		} // if

		if (nombreJugador == null) {
			System.out.println("Dime el nombre de tu personaje");
			nombreJugador = sc.nextLine();
		} // if
		byte opcion;
		do {
			System.out.println("Elige una opcion\n\t1- Jugar en 1D\n\t2- Jugar en 2D\n\t3- Jugar en 3D");
			opcion = Byte.parseByte(sc.nextLine());
		} while (opcion!=1&&opcion!=2&&opcion!=3);
		
		switch(opcion) {
		case 1:
			FuncionesArrays.jugar(nombreJugador, generoJugador);
			break;
		case 2:
			FuncionesMatrices.jugar(nombreJugador, generoJugador);
			break;
		case 3:
			FuncionesMatrices3D.jugar(nombreJugador, generoJugador);
			break;
		}
		
	}
}


