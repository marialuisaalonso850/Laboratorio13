
/**
 *Maria Luisa Alonso Giraldo
 *Profesor Cristian Henao
 *Laboratorio 13
 *
 */
public class Flechas {
	
	int longitud;
	String color;
	
	/**
	 * 
	 * se define la longitud y el color 
	 */
	
	public Flechas() {
		longitud=18;
		color= "negro";
	}
	
	
	/**
	 * 
	 * @param longitud
	 * @param color
	 */
	
	public Flechas (int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	

	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	/**
     * recorre la la fecha hasta que llegue al final de la longitud definida
     */
	
	public void construirFlecha() {
		for(int i=0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}
	
	/**
     * 
     *
     * @param simbolo. 
     */
	
	private void imprime(String simbolo) {
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.out.print(simbolo);
		}
			
	}
	 
	

}
