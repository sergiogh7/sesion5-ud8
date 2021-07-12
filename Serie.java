/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class Serie {
	
	// Atributos.
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Valores por defecto.
	private final int numeroTemporadasDefecto = 3;
	private final boolean entregadoDefecto = false;
	
	// Constructores.
	
	// Constructor por defecto.
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = numeroTemporadasDefecto;
		this.entregado = entregadoDefecto;
		this.genero = "";
		this.creador = "";
	}
	
	// Constructor con titulo y credor, resto por defecto.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadasDefecto;
		this.entregado = entregadoDefecto;
		this.genero = "";
		this.creador = creador;
	}
	
	// Constructor con todos los atributos excepto el de entregado.
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	// Metodo toString.
	public String toString() {
		return "\nTitulo: "+titulo+".\nNumero de temproadas: "+numeroTemporadas+".\nEntregado: "
				+ ""+entregado+".\nGenero: "+genero+".\nCreador: "+creador+".\n";
	}
	
	

}
