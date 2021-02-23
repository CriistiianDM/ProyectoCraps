package proyectoCraps;


/**
 * The Class ControlCraps. Maneja la dinamica del juego, determinando el estado, tiro, punto ... del juego
 */
public class ControlCraps {

	
	private Dados dado_1 , dado_2 ;
	

	private int tiro , punto , estado;
	
	
	private boolean lanzamiento = true;
	
	
	private int[] carasDados;
	


	/**
	 * Instantiates a new control craps. Constrututor que crea los objectos
	 */
	public ControlCraps () {

		dado_1 = new Dados();
		dado_2 = new Dados();
		carasDados = new int[2];

	}
	
	/**
	 * Calcular tiro. Determina el valor del tiro, simulando el lanzamiento de los dados.
	 */
	public void calcularTiro () {
		carasDados[0] = dado_1.getCaraDadoV();
	    carasDados[1] = dado_2.getCaraDadoV();
		tiro = carasDados[1] + carasDados[0];
		
	}
	
	/**
	 * Determinar juego. Determina el estado del juego: estado = 1 gana , estado = 2 pierde ,estado  = 3 punto
	 */
	public void determinarJuego() {
		
		if (lanzamiento) {
			
			if (tiro == 7 ||  tiro == 11 ) {
				estado = 1; // gana
			}
			else if (tiro == 2 ||  tiro == 12 || tiro == 3) {
				estado = 2; // pierde
			}
			else {
				estado = 3;  // gana un punto
				punto = tiro;
				lanzamiento = false;
			} 
			
		} else {
			
			rondaPunto();
		}
		
		
	}
	
	/**
	 * Ronda punto. determina el estado del punto cuando entra en la ronda punto.
	 */
	private void rondaPunto() {
		
		if (tiro == punto) {
			estado = 1;
				
		} else if (tiro == 7) {
			estado = 2;
			
		}
		
		lanzamiento = true;	
	}
	
	/**
	 * Sets the abandono. estabalece el estado cuando el usuario abandona la partida del punto
	 */
	public void setAbandono () {
		estado = 2;
		lanzamiento = true;
	}
	

	/**
	 * Gets the tiro.
	 *
	 * @return the tiro  
	 */
	public int getTiro() {
		return tiro;
	}

	/**
	 * Gets the punto.
	 *
	 * @return the punto 
	 */
	public int getPunto() {
		return punto;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Gets the dado 1.
	 *
	 * @return the dado 1
	 */
	public int getDado_1() {
		return carasDados[0];
	}

	/**
	 * Gets the dado 2.
	 *
	 * @return the dado 2
	 */
	public int getDado_2() {
		return carasDados[1];
	}

}
