//Se idento todo el codigo tras agregar las {} correspondientes
package com.generation;

import java.util.Scanner;//Se importo scanner para poder utilizar la captura de datos en consola

//Se creo el proyecto y se acomodo en el package indicado

public class Codigo4 {// Se actualizo el nombre del archivo para ser igual a la clase

	public static void main(String[] args) {//Se creo el metodo main y se movio todo dentro de este

		Scanner s = new Scanner(System.in); //Se agrego System.in para indicar que se insertara desde consola
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		Scanner s2 = new Scanner(System.in); //Se agrego System.in para indicar que se insertara desde consola
		String j2 = s2.nextLine();//Se cambio el valor que lee de s a s2
		
		//agregar verificacion de que se ingresaron correctamente los datos 
		
		if (j1.equals(j2)) {//Se removio ) y se utilizo la funcion equals
			System.out.println("Empate");
		} 
		else {
			int g = 2;
			switch(j1) {
			case "piedra":
				if (j2.equals("tijeras")) {//Se cambio a j2.equals("tijeras")
					g = 1;
				}
				break;//se agrego break para evitar que continue
				
			case "papel":
				if (j2.equals("piedra")) {//Se cambio a j2.equals("piedra")
					g = 1;
				}//Se agrego }
				break;//se agrego break para evitar que continue
				
			case "tijeras"://Se cambio a tijeras para que sea igual a las instrucciones
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
				
			default:
				break;//Se agrego break;
			}
			System.out.println("Gana el jugador " + g);
		}
	}
}