
public class Colores {


	private String colorconfeti;
	
	private final String[] colors = {"Rojo", "Azul", "Amarillo", "Blanco", "Verde", "Negro","Morado", "Plateado"
							, "Dorado", "Celeste", "Rosado", "Indigo", "Turquesa", "Fuccia", "Gris", "Café"
							, "Naranja"};
	
	public Colores() {
        this.colorconfeti =  colors[(int) (Math.random() * colors.length)];
              
    }

	public String getColorconfeti() {
		return colorconfeti;
	}

	public void setColorconfeti(String colorconfeti) {
		this.colorconfeti = colorconfeti;
	}

	@Override
	public String toString() {
		return  colorconfeti + ".";
	}

	
	
	
	
}
