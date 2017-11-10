public abstract class Moviles {
//protected String descripcion= "vehiculo generico";
protected String tipo = "auto";
protected String marca= "audi";
protected String modelo= "A5";
public String tipo(){
	return tipo;
}
public String marca() {
	return marca;
}
public   String modelo(){
	return modelo;
}

public abstract  int velocidadMaxima ();
public abstract double consumo ();

}
