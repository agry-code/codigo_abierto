package ataque.goblin.dam;

public class FuncionesMatrices3D {
	public static String[][][] generaTablero(byte tam) {
		String[][][] tablero = new String[tam][tam][tam];
		for (byte i = 0; i < tam; i++) {
			for (byte j = 0; j < tam; j++) {
				for (byte k = 0; k < tam; k++) {
					tablero[i][j][k] = "♒";
				}
			}
		}
		return tablero;
	}
	
	
	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid"+Funciones.terminacionGenero(generoJugador,false)+
				" al Ataque de los Goblin en 3D");
	}
}
