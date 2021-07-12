/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		// Pasandole un color y consumo energetico correctos.
		Electrodomestico prueba = new Electrodomestico(50, "Negro", "A", 3);
		
		// Pasandole un color y consumo energetico incorrectos.
		Electrodomestico prueba2 = new Electrodomestico(15, "java", "S", 3);
		
		System.out.println(prueba.toString());
		System.out.println(prueba2.toString());

	}

}
