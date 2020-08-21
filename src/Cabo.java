
public class Cabo {

	private String apellido;
	
	private final String[] apellidos = {"Perez", "Mart�nez", "Vargas", "Vasquez", "Gonzalez", "Jimenez",
            				"Escalona", "Fuentes", "Mej�as", "Huenchull�n", "Villablanca", "Guzm�n", "Ryan",
            				"Pino", "Ibarra", "Salda�a", "Acu�a", "Parra", "Henriquez", "Kuerten",
            				"R�os", "Sampras", "Sotomayor", "Agassi", "Guerra", "Fa�ndez", "Jobs", "Gates",
            				"Rosas", "Tyler", "Y�venes", "Fagalde", "Romero", "Zabaleta", "Vicu�a", "Camiroaga"};
	
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
