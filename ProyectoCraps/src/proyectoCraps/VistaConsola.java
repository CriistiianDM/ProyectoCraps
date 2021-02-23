/**
 *  Programacion interactiva
 *  Autor: Cristian Duvan Machado
 *  Codigo:201940062
 *  Desarrollo: juego Craps
 *  
 * **/
package proyectoCraps;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class VistaConsola. Clase encargada de interatuar con el usuario por consola, usando el objecto Scanner.
 */
public class VistaConsola {
	
	
	private ControlCraps control;
	private String respuesta;
	private Scanner entradaDeDatos;
	
	
	/**
	 * Instantiates a new vista consola. Constrututor de la clase para iniciar los objectos auxiliares.
	 */
	public VistaConsola() {
		
		control = new ControlCraps();
		entradaDeDatos = new Scanner(System.in);
		
	}
	
	
    /**
     * Iniciar juego. Inicia el videojuego
     */
    public void iniciarJuego () {
    	
    	System.out.println("Desea lanzar los lados?  escribe y/n: ");
    	respuesta = entradaDeDatos.nextLine();    	
    	
    	if (respuesta.equals("y")) {
    		
    		control.calcularTiro();
    		System.out.printf(" Dado 1: %d  , Dado 2: %d , tiro : %d " , control.getDado_1() , control.getDado_2() , control.getTiro());
    		
    		control.determinarJuego();
    		
    		switch (control.getEstado()) {
    		  
    		case 1:
    			System.out.println("Has ganado!!");
    	        break;
    		case 2:
    			System.out.println("Has perdido f!!");
    			break;
    		case 3:
    			System.out.printf("Has obtenido un punto : %d , lanza Nuevamente" , control.getPunto());
    			
    			while (control.getEstado() == 3) {
    				
    		    System.out.println("Deseas lanzar?  escribe y/n");
    		    respuesta = entradaDeDatos.nextLine();  
    		    if ( respuesta.equals("y") ) {
    		    	
        	    	control.calcularTiro();
        	    	System.out.printf(" Dado 1: %d  , Dado 2: %d , tiro : %d " , control.getDado_1() , control.getDado_2() , control.getTiro());
        	    	control.determinarJuego();
        		    	
        		    } else {
        		    	System.out.println("holis");
        		    	control.setAbandono();
        		    	
        		    }
    	         
    				
    			}
    			
    			if (control.getEstado() == 1) {
    				System.out.println("Ganaste y lograste punto"); 				 
    			} else {
    				System.out.println("perdiste!!");
    			}
    			
    			break;
    			
    		}
    		
    		seguirJuego();
    	} else {
    		System.out.println("Chao!!");
    	}
    }
	
	/**
	 * Seguir juego. Inicia una nueva ronda 
	 */
	public void seguirJuego() {
		
		System.out.println("Quieres jugar otra ronda? escribe y/n? ");
		respuesta = entradaDeDatos.nextLine(); 
		
		if (respuesta.equals("y")) {
			iniciarJuego ();
		} else {
			System.out.println("Chao!!");
		}
		
	}

}
