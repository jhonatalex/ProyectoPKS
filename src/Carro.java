
public class Carro {
	
	private int ocupantes;
	private String fecha;			//fecha de ingreso
	private int fila;
	private int columna;
	Fechas year = new Fechas();
	
	public Carro() {
		this.ocupantes=(int)(Math.random()*3+1);
		this.fecha=year.toString();
			
		
	}


	public Carro(int ocupantes, String fecha, int fila, int columna) {
		super();
		this.ocupantes = ocupantes;
		this.fecha = fecha;
		this.fila = fila;
		this.columna = columna;
	}


	public int getOcupantes() {
		return ocupantes;
	}


	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocupantes + ", fecha=" + fecha + ", fila=" + fila + ", columna=" + columna + "]";
	}
	
	
	
	
	
}//FIN CLASE
