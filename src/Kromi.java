
public class Kromi extends Carro {
	

	public final int LARGOK=3;		//CELDAS HACIA ABAJO

	String fabricacion;					//AÑO
	String marca;
	int largo;
	Fechas year=new Fechas();
	
	
	
	private final String[] marcas = {"Mercedes Benz", "Dodge", "Chevrolet"};
	
	

	public Kromi(int fila, int columna) {
		this.setFila(fila);
		this.setColumna(columna);
		this.fabricacion=year.toString();
		this.marca=marcas[(int) (Math.random() * marcas.length)];
	}
	
	
	public Kromi(int ocupantes, String fecha, int fila, int columna, String fabricacion, String marca) {
		super(ocupantes, fecha, fila, columna);
		// TODO Auto-generated constructor stub
		this.fabricacion=fabricacion;
		this.marca=marca;
		this.largo=LARGOK;
		
	}
	public void transportarPKS() {
		
	}



	public String getFabricacion() {
		return fabricacion;
	}




	public void setFabricacion(String fabricacion) {
		this.fabricacion = fabricacion;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getLargo() {
		return largo;
	}




	public void setLargo(int largo) {
		this.largo = largo;
	}


	@Override
	public String toString() {
		return "Kromi: Marca " + marca + ", Fabricada el año " + fabricacion + " Mide " + LARGOK+ " mt. de largo"
				+". Ubicación: "+getFila()+","+getColumna();
	}



}//FIN CLASE
