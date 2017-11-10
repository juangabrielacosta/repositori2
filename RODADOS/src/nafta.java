
public class nafta extends decorator {
	private Moviles movil ;
	public nafta(Moviles movil) {
		this.movil= movil;
	}
		public String tipo (){
			return movil.tipo;
		}
		public String marca (){
			return movil.marca;
		}
	public String modelo () {
		return movil.modelo+ "  naftero";
	}
	public int velocidadMaxima() {
		return movil.velocidadMaxima()+60;
	}
	public double consumo (){
		return this.movil.consumo() +2.6;
	}
}
