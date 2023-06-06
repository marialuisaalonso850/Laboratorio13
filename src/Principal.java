
public class Principal {
	

	Flechas flecha1, flecha2, flecha3;
	 public static void main(String [] args) {
		 
		 Principal Principal= new Principal();
	 }
	 
	 /**
	  * crea  varias instancias en el constructor principal 
	  * el cual  llama los metodos ya realizados en la clase flecha y imprime
	  */
	 public Principal() {
		 flecha1=new Flechas();
		 flecha1.construirFlecha();
		 flecha1.imprimirEspacio();
		 
		 flecha2=new Flechas();
		 flecha2.longitud=34;
		 flecha2.color="rojo";
		 flecha2.construirFlecha();
		 
		 flecha3=new Flechas(12, "negro");
		 flecha3.imprimirEspacio();
		 flecha3.construirFlecha();
		
		 
	 }

}
