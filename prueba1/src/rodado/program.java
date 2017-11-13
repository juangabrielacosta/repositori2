package rodado;

public class program {

	public program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Vehiculos moto = new motocicleta("zanella");
//		//moto =new diesel(moto);
//		moto = new gasoil(moto);
//		
		Vehiculos auto= new automovil("topo");
		auto = new gasoil(auto);
mostrar(auto);

Vehiculos auto2 = new automovil("mercedes");
auto2 = new diesel(auto2);
mostrar (auto2);
	}
	public static void mostrar (Vehiculos v) {
		System.out.println(v.descripcion());
		System.out.println(v.velocidadMaxima());
		System.out.println(v.Consumo());
		
	}

}
