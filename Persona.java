
/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class Persona {
	
	// Atributos
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
	// Sexo por defecto.
	private final String sexoDefecto = "H";
	
	// Constructor por defecto.
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0;
		
	}
	
	// Constructor con el nombre, edad y sexo, el resto por defecto.
	public Persona(double peso, double altura) {
		this.nombre = "Sergio";
		this.edad = 32;
		this.sexo = "H";
		this.dni = "";
		this.peso = 0;
		this.altura = 0;
		
	}
	
	// Constructor con atributos como parametro.
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	// Metodo toString.
	public String toString() {
		return "Nombre: "+nombre+".\nEdad: "+edad+" años.\nDNI: "+dni+".\nSexo: "+sexo+"\nPeso: "+peso+" Kg.\nAltura: "+altura+" cm.\n";
	}
	
	// Getters y setters.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
