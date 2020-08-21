
public class Trupalla extends Carro{

	public final int ESPACIOT=1; //1 CELDA
	
	int armadura;			//NIVEL ENTRE 1 - 5
	String nombre;			//NOMBRE CONDUCTOR
	Cabo conductor= new Cabo ();
	
	
		
	public Trupalla(int fila, int columna) {
		this.setFila(fila);
		this.setColumna(columna);
		this.armadura=(int) (Math.random()*5+1);
		this.nombre=conductor.toString();
		
	}
	
	
	public Trupalla(int ocupantes, String fecha, int fila, int columna, int armadura, String nombre) {
		super(ocupantes, fecha, fila, columna);
			this.armadura=armadura;
			this.nombre=nombre;
			
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Trupalla: N.Armadura: " + armadura + ", Driver: " + nombre + " + " + getOcupantes()
			+ " Ocupantes. En la institución desde el año: " + getFecha()+ " Ubicación: " + getFila()
			+","+getColumna();
				
	}

	
	
}//FIN CLASE
