
/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class Password {
	
	private int longitud;
	private String contrasenya;
	
	// Por defecto longitud.
	final private int longitudDefecto = 8;

	// Constructor por defecto.
	public Password() {
		this.longitud = longitudDefecto;
		this.contrasenya = "0";
		
	}
	
	// Constructor con longitud que se le pase.
	// Genera una contraseña aleatoria con dicha longitud.
	public Password(int longitud) {
		
		this.contrasenya = generadorContrasenya(longitud);
		
	}
	
	// Funcion que genera una contraseña con la longitud pasada por parametro.
	public static String generadorContrasenya( int longitud) {
		
		String contrasenya = "";
		int numero;
		
		// Genera numeros del 0 al 9 aleatoriamente.
		for (int i = 0; i < longitud; i++) {
			
			// Genera el numero.
			numero = (int)(Math. random()*10);
			
			// Lo guarda en la variable contraseña.
			contrasenya += numero;
			
		}
		
		return contrasenya;
		
	}

	// Getters y setters para probarlo en otra clase.
	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	

}
