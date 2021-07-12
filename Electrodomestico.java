/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class Electrodomestico {
	
	// Variables.
	protected double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;
	
	// Variables por defecto.
	protected final String colorDefecto = "Blanco";
	protected final String consumoEnergeticoDefecto = "F";
	protected final double precioBaseDefecto = 100;
	protected final double pesoDefecto = 5;
	
	
	// Constructores.
	
	// Por defecto.
	public Electrodomestico() {
		this.precioBase = precioBaseDefecto;
		this.color = colorDefecto;
		this.consumoEnergetico = consumoEnergeticoDefecto;
		this.peso = pesoDefecto;
		
	}
	
	// Con el precio base y peso, resto por defecto.
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = colorDefecto;
		this.consumoEnergetico = consumoEnergeticoDefecto;
		this.peso = peso;
		
	}
	
	// Con todos los atributos.
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		
		this.precioBase = precioBase;
		
		// Si al llamar a la funcion que comprueba el color devuelve true, 
		// el color sera el que se le pasa pro parametro, sino sera por defecto.
		if(compruebaColor(color)) {
			this.color = color;
			
		}else{
			this.color = colorDefecto;
		}
		
		// Llama a la funcion que comprueba el consumo energetico, si devuelve true, 
		// el color sera el que se le pasa pro parametro, sino sera por defecto.
		if(compruebaConsumo(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
			
		}else {
			this.consumoEnergetico = consumoEnergeticoDefecto;
		}
		
		this.peso = peso;
		
	}
	
	// Funcion que comprueba que el consumo energetico es correcto, devuelve true o false.
	public boolean compruebaConsumo(String consumoEnergetico) {
		
		boolean esCorrecto;
		
		// Pasa a lower case.
		consumoEnergetico = consumoEnergetico.toLowerCase();
		
		switch (consumoEnergetico) {
		
		case "a":
			esCorrecto = true;
			break;
			
		case "b":
			esCorrecto = true;
			break;
			
		case "c":
			esCorrecto = true;
			break;
			
		case "d":
			esCorrecto = true;
			break;
			
		case "e":
			esCorrecto = true;
			break;
			
		case "f":
			esCorrecto = true;
			break;

		default:
			esCorrecto = false;
			break;
		}
		
		return esCorrecto;
	}

	// Funcion que comprueba si el color es correcto, devuelve true o false.
	public boolean compruebaColor(String color) {
		
		boolean esCorrecto;
		
		// Pasa el string a lower case.
		color = color.toLowerCase();
		
		// Si el color que llega es blanco, negro, rojo, azul o gris devuelve true.
		switch (color) {
		case "blanco":
			esCorrecto = true;	
			break;
					
		case "negro":
			esCorrecto = true;
			break;
			
		case "rojo":
			esCorrecto = true;
			break;
			
		case "azul":
			esCorrecto = true;
			break;
			
		case "gris":
			esCorrecto = true;
			break;

		default:
			esCorrecto = false;
			break;
		}
		
		return esCorrecto;
		
	}
	
	// Metodo toString.
	public String toString() {
		return "Precio base: " + precioBase + "€\nColor: " + color + "\nConsumo energetico: "
				+ consumoEnergetico + "\nPeso: " + peso + "\n";
	}

	// Getters y setters.
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
