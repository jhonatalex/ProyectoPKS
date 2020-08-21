
public class Huevo extends Tablero {			//esta clase define cada lanzamiento realizado
								//por cada instancia de esta clase se desa conocer la fila y la columna donde cay� el proyectil
								//yel puntaje obtenido por el lanzamiento.

	private int puntaje;

	private int filahuevo;
	private int columnahuevo;
	
	
	
	public Huevo(int puntaje, int filahuevo, int columnahuevo) {
	 this.puntaje=puntaje;
	 this.filahuevo=filahuevo;
	 this.columnahuevo=columnahuevo;
	 
			
	}
	/*

	@Override
	public void lanzarHuevo() {
		// TODO Auto-generated method stub
		super.lanzarHuevo();
	}
*/
	

	@Override
	public int getFila() {
		// TODO Auto-generated method stub
		return super.getFila();
	}

	@Override
	public int getColumna() {
		// TODO Auto-generated method stub
		return super.getColumna();
	}
	
		
	public int getFilahuevo() {
		return filahuevo;
	}
	public void setFilahuevo(int filahuevo) {
		this.filahuevo = filahuevo;
	}
	public int getColumnahuevo() {
		return columnahuevo;
	}
	public void setColumnahuevo(int columnahuevo) {
		this.columnahuevo = columnahuevo;
	}
	@Override
	public String toString() {
		return "Huevo Puntaje total:" + puntaje + ", Ubicaci�n: (" + filahuevo + ", " + columnahuevo + ")";
	}

	







}// FIN CLASE

