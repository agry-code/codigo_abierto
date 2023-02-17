package ataque.goblin.dam;

import java.util.Scanner;

public class Funciones {
	public static char darGenero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el género de tu jugador (m/f/n)");
		char generoJugador=sc.nextLine().charAt(0);
		if(!(generoJugador=='m'||generoJugador=='f'||generoJugador=='n')) {
			generoJugador=darGenero();
		}
		return generoJugador;
		
	}
	
	
	public static char terminacionGenero(char genero, boolean masculinoOmitido) {
		if(genero=='m') {
			if(!masculinoOmitido) {
				return 'o';
			}
			return 0;
		}
		if(genero=='f') {
			return'a';
		}
		return 'i';
	}

	

	
}
