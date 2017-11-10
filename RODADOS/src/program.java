/**
 * 
 */

/**
 * @author Juan
 *
 */public class program {
	public static void 	main(String[] args) {
		Moviles autoNaftero = new automovil();
		 autoNaftero= new nafta(autoNaftero);
		Moviles autoGasolero = new automovil();
		autoGasolero= new gasoil(autoGasolero);
  mostrar(autoNaftero);
  mostrar(autoGasolero);

	}
	
public static void mostrar(Moviles v){
	System.out.println("Tipo "+v.tipo());
	System.out.println("Marca "+v.marca());
	System.out.println("Modelo "+v.modelo());
	System.out.println("Velocidad maxima "+v.velocidadMaxima());
	System.out.println("Consumo "+v.consumo());
}
}