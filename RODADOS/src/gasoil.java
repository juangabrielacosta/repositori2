
public class gasoil  extends decorator{
private Moviles automovil;
	public gasoil(Moviles automovil) {
		this.automovil=automovil;
	}
	

public String tipo() {
	return automovil.tipo();
}
public String marca() {
	return automovil.marca();
}
public String modelo() {
	return automovil.modelo()+" gasolero";
}
public int velocidadMaxima (){
	return automovil.velocidadMaxima()+30;
}
public double consumo () {
	return automovil.consumo()+0.2;
}
		
	

}

