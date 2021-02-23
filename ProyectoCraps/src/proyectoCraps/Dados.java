/**
 *  Programacion interactiva
 *  Autor: Cristian Duvan Machado
 *  Codigo:201940062
 *  Desarrollo: juego Craps
 *  
 * **/

package proyectoCraps;

import java.util.Random;


/**
 * The Class Dados. Simula 2 dados, generando resultados aleatorios en cada lanzamiento, para cada dado.
 */
public class Dados {
    
	/** The cara dado V.  genera numeros random entre 1 a 6*/
	private int caraDadoV;
	
	

	/**
	 * Gets the cara dado V. Determina el valor para cada dado.
	 *
	 * @return the cara dado V. devuelve el valor aletorio para cada dado(1 a 6).
	 */
	public int getCaraDadoV() {
	 
	  Random dadoAletorio = new Random();
	  caraDadoV = dadoAletorio.nextInt(6)+1;
			  
			  
		return caraDadoV;
	}
	
}
