
public class Cabo {

	private String apellido;
	
	private final String[] apellidos = {"Perez", "Martínez", "Vargas", "Vasquez", "Gonzalez", "Jimenez",
            				"Escalona", "Fuentes", "Mejías", "Huenchullán", "Villablanca", "Guzmán", "Ryan",
            				"Pino", "Ibarra", "Saldaña", "Acuña", "Parra", "Henriquez", "Kuerten",
            				"Ríos", "Sampras", "Sotomayor", "Agassi", "Guerra", "Faúndez", "Jobs", "Gates",
            				"Rosas", "Tyler", "Yévenes", "Fagalde", "Romero", "Zabaleta", "Vicuña", "Camiroaga"};
	
	public Cabo() {
        this.apellido =  apellidos[(int) (Math.random() * apellidos.length)];
              
    }

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cabo " + apellido;
	}
	
	
	
	
	
}
