
public class Caguano extends Carro{
		
	
		public final int LARGOC=2;    //CELDAS HORIZONTALES
		
		int alcance;					//DEL CONFETI
		String colorconfeti;         
		Colores color =new Colores();
	
	
	public Caguano(int fila, int columna) {
		this.setFila(fila);
		this.setColumna(columna);
		this.alcance=(int) (Math.random()*9+3);
		this.colorconfeti=color.toString();
	}

	public Caguano(int ocupantes, String fecha, int fila, int columna, int alcance, String colorconfeti ) {
		super(ocupantes, fecha, fila, columna);
			this.alcance=alcance;
			this.colorconfeti=colorconfeti;
		
					
	}
	
	public void lanzarConfeti() {
		
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public String getColorconfeti() {
		return colorconfeti;
	}

	public void setColorconfeti(String colorconfeti) {
		this.colorconfeti = colorconfeti;
	}

	@Override
	public String toString() {
		return "Caguano: Mide " + LARGOC + "mt.de largo, Lanza Confeti a " + alcance + " mt. y de Color " + colorconfeti + " Ubicación: "
				+ getFila()+","+getColumna();
	}
	
	
	
	
}//FIN CLASE
