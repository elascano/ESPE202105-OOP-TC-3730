CODE:
package ejerciciosDos.Conversores;

/*
 *  Crea la clase peso, la cual tendrá las siguientes características:
 *  	Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
 *  	En el constructor se le pasará el peso y la medida en la qué se ha tomado ‘Lb’ 
 *  	para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, 
 *  	‘G’ para gramos y ‘Q’ para quintales).
 *  	Deberá tener los siguientes métodos:
 *  		getLibras. Devuelve el peso en libras.
 *  		getLingotes. Devuelve el peso en lingotes.
 *  		getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb' para libras, 
 *  		‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K' para kilos, ‘G’ para gramos 
 *  		y ‘Q’ para quintales).
 *  	Para la realización del ejercicio toma como referencia los siguientes datos: 
 *  	1 Libra = 16 onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg. 1 Onza = 0,0625 libras = 28,35 gramos. 1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
 */

public class Peso {
	
	//peso en kilos
	private double peso;
	
	public Peso(double peso, String unidad){
		this.peso = peso * factorConversion(unidad);
	}
	
	private double factorConversion(String unidad){
		double factor;
		
		switch(unidad){
		case "lb": factor = 453/1000.0;
			break;
		case "li": factor = 14.59;
			break;
		case "oz": factor = 38.35/1000;
			break;
		case "p": factor = 1.55/1000;
			break;
		case "k": factor = 1;
			break;
		case "g": factor = 1000;
			break;
		case "q": factor = 43.3;
			break;
		default: factor = 1; // si no lo entiende no hace conversión, asume que son kg
		}
		return factor;
	}
	
	public double getLibras() {
		return peso/factorConversion("lb");
	}
	
	public double getLingotes() {
		return peso/factorConversion("li");
	}
	
	public double getPeso(String medida) {
		return peso/factorConversion(medida);
	}
	
	public static void main (String[] ags){
		Peso camion;
		camion = new Peso(3000,"li");
		
		System.out.println("Peso del camión en medida inicial: " + camion.getPeso("k") + " kg.");
		System.out.println("Peso del camión en kilos inicialmente: " + camion.getPeso("oz") + " oz.");
		
		//Mirar su ejercicio para ver el resto
	}

}