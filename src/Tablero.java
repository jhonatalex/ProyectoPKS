import java.util.*;


public class Tablero {
	Scanner leer = new Scanner(System.in);
	
	private int fila;
	private int columna;
	private char [][] matriztablero = new char [15][15];
	private char [][] matrizghost= new char [15][15];
	int puntaje=0;
		
	private ArrayList<Carro> vehiculos =new ArrayList <Carro>(18);		//Cantidad ya definida
	private ArrayList<Huevo> proyectiles=new ArrayList <Huevo>();		//sin limite
		
	
public Tablero() {				//CONSTRUCTOR X DEFECTO
	
	
	for (int i = 0; i < 10; i++) { // INSERTA 10 TRUPALLAS
		insertarTrupalla();
	}
	
	for (int i = 0; i < 5; i++) { // INSERTA 5 CAGUANOS
		insertarCaguano();
	}
	
	for (int i = 0; i < 3; i++) { // INSERTA 3 KROMIS
		insertarKromi();
	} 
	 	
			
}
	
	
public void insertarTrupalla() {
		fila=0;
		columna=0;
		
		do {
			
			fila= (int) (Math.random()*15);	
			columna= (int) (Math.random()*15);
		
		}while (!validarCelda(fila, columna)); // VERIFICO SI LA CELDA ESTA VACIA
		
		
		matriztablero[fila][columna]='T';   // INSERTO LA TRUPALLA EN TABLERO
		

		Trupalla trupalla1 =new Trupalla(fila, columna); // CREO LA TRUPALLA Y LA AGREDO AL ARRAY
		vehiculos.add(trupalla1);
}
	


public void insertarCaguano() {
			fila=0;
			columna=0;
	
		do {				
			fila= (int) (Math.random()*15);
			columna= (int) (Math.random()*14);
			
		}while (!validarCelda(fila, columna)||!validarCelda(fila, columna+1));
	
		
			matriztablero[fila][columna]='C';
			matriztablero[fila][columna+1]='C';	
			
				
		Carro caguano1 =new Caguano(fila, columna);
		vehiculos.add(caguano1);
		
}	
	
	
public void insertarKromi() {
		fila=0;
		columna=0;
		
	do {
	
		fila= (int) (Math.random()*13);
		columna= (int) (Math.random()*15);

	}while (!validarCelda(fila, columna)||!validarCelda(fila+1, columna)||!validarCelda(fila+2, columna));
		
		matriztablero[fila][columna]='K';
		matriztablero[fila+1][columna]='K';	
		matriztablero[fila+2][columna]='K';	
	
				
		Carro kromi1 =new Kromi(fila, columna);
		vehiculos.add(kromi1);		
		
}
	
	
	
public void dibujartablero() {
	
	
		System.out.println("==============================================================");
		System.out.println("=================  TABLERO  DE EFECTIVOS PKS  ================");
		System.out.println("= 0   1   2   3   4   5   6   7   8   9   10  11  12  13  14 =");
		System.out.println("____________________________________________________________");
							
			for (int i = 0; i < 15; i++) {  //DIBUJA EL TABLERO
				for (int j = 0; j < 15; j++) {
					
					System.out.print("|");
					System.out.print("_" + matriztablero[i][j] + "_");
				}
				System.out.println("|"+i);
				
		 	}
		
}//FIN DIBUJAR TABLERO
	
	
public boolean validarCelda(int fila, int columna) {
	
		if (matriztablero[fila][columna]=='T' || matriztablero[fila][columna]=='C' || matriztablero[fila][columna]=='K') {
			return false;
		}else{
			return true;
		}

				
}//FIN VALIDAR CELDA 

public boolean validarCeldaH(int fila, int columna) {
	
	if (matriztablero[fila][columna]=='H') {
		return false;
	}else{
		return true;
	}

			
}//FIN VALIDAR CELDAH 


public void lanzarHuevo() { //CREA INSTANCIA CLASE HUEVO Y PIDE COORD DE LANZAMIENTO
								//ASIGNA PUNTAJE Y ALMACENA EN LISTA CORRESPONDIENTE 
	int filahuevo = 0;
	int columnahuevo = 0;
	int aux1=0;
	int aux2=0;
	int aux3=0;
	int aux4=0;
	int aux5=0;
	int aux6=0;
		
		mostrarMatrizactualizada(filahuevo, columnahuevo,false);
	
		System.out.println("");
		System.out.println("       *******************************    ");
		System.out.println("     **** COORDENADAS DE LANZAMIENTO ***  ");
		System.out.println("   ***************************************");
		System.out.print("***  Ingresa N° de Fila    (Entre 0 y 14):");
		System.out.println("");
		filahuevo=leer.nextInt();
		System.out.print("***  Ingresa N° de Columna (Entre 0 y 14):");
		System.out.println("");
		columnahuevo=leer.nextInt();
			
		
		for (int i = 0; i < matriztablero.length; i++) {
			for (int j = 0; j < matriztablero.length; j++) {
				
				if(matriztablero[i][j]=='T') {
					aux1=i;
					aux2=j;
				}	
				if(matriztablero[i][j]=='C') {
					aux3=i;
					aux4=j;
							
				}
				if(matriztablero[i][j]=='K') {
					aux5=i;
					aux6=j;
				}
					
			}			
		}
		
		if (matriztablero[aux1][aux2]==matriztablero[filahuevo][columnahuevo]) {
				System.out.println("BIEN! LE DISTE A UNA TRUPALLA SUMAS 1 PUNTO");
				System.out.println("");
				 puntaje=puntaje +1;
		}	 
			else if (matriztablero[aux3][aux4]==matriztablero[filahuevo][columnahuevo]) {
						System.out.println("BIEN! LE DISTE A UN CAGUANO SUMAS 2 PUNTOS");
						puntaje=puntaje +2;	
						 
				if (columnahuevo>=0 && columnahuevo<=13) {												
					
					if(!validarCeldaH(filahuevo, columnahuevo) || !validarCeldaH(filahuevo, columnahuevo+1)){ 
					  
						System.out.println("ELIMINASTE UN CAGUANO! SUMAS 7 PUNTOS EXTRA!");
						puntaje=puntaje + 7;
					}
				}	
			
				if (columnahuevo>=1 && columnahuevo<=14) {
					 
					if (!validarCeldaH(filahuevo, columnahuevo-1)) {
						 
						System.out.println("ELIMINASTE UN CAGUANO! SUMAS 7 PUNTOS EXTRA!");
						puntaje=puntaje+7; 
					}	 
				}	 
			}		
	
		
		else if (matriztablero[aux5][aux6]==matriztablero[filahuevo][columnahuevo]) {
							System.out.println("BIEN! LE DISTE A UNA KROMI SUMAS 3 PUNTOS");
							puntaje=puntaje +3;		
					
					if (filahuevo==0 )	{	
				
							if (!validarCeldaH(filahuevo, columnahuevo) || (!validarCeldaH(filahuevo+1, columnahuevo) 
								 && !validarCeldaH(filahuevo+2, columnahuevo))) {
								
								System.out.println("ELIMINASTE UNA KROMI! SUMAS 10 PUNTOS EXTRA!");
								puntaje=puntaje +10;
							}
					}		
					if(filahuevo==1) {
							if (!validarCeldaH(filahuevo, columnahuevo) || (!validarCeldaH(filahuevo+1, columnahuevo) 
								 && !validarCeldaH(filahuevo-1, columnahuevo))) {
									
								System.out.println("ELIMINASTE UNA KROMI! SUMAS 10 PUNTOS EXTRA!");
								puntaje=puntaje+10;
							}
					}
					if (filahuevo>=2 && filahuevo<=12)	{
										
						if((!validarCeldaH(filahuevo, columnahuevo) || (!validarCeldaH(filahuevo+1, columnahuevo)) 
								 && (!validarCeldaH(filahuevo+2, columnahuevo))) ||(!validarCeldaH(filahuevo, columnahuevo) 
										 || (!validarCeldaH(filahuevo-1, columnahuevo))  && (!validarCeldaH(filahuevo-2, columnahuevo))) ) {
						
							System.out.println("ELIMINASTE UNA KROMI! SUMAS 10 PUNTOS EXTRA!");
							puntaje=puntaje+10;
						}						
					}
					if (filahuevo>12 && filahuevo<=14)	{
						
						if((!validarCeldaH(filahuevo, columnahuevo) || (!validarCeldaH(filahuevo-1, columnahuevo)) 
								 && (!validarCeldaH(filahuevo-2, columnahuevo)))) {
							
							System.out.println("ELIMINASTE UNA KROMI! SUMAS 10 PUNTOS EXTRA!");
							puntaje=puntaje+10;
						}
					}
		}			
			 
		else {  System.out.println("FALLASTE!! INTENTALO DE NUEVO...");
					
				if (!validarCeldaH(filahuevo, columnahuevo)) {
					System.out.println("YA ATACASTE ESTA POSICION :(");
					
				}
				
		}	
		
			Huevo huevo1=new Huevo(puntaje, filahuevo, columnahuevo);
			proyectiles.add(huevo1);			//GUARDAMOS EL HUEVO EN EL ARRAY
		
			matriztablero[filahuevo][columnahuevo]='H';
			mostrarMatrizactualizada(filahuevo, columnahuevo,true);
			
			
	}//FIN LANZAR HUEVO								
					
	
	
	public void mostrarMatrizactualizada (int filahuevo, int columnahuevo,boolean check) { //MUESTRA TABLERO CON CARROS Y LANZAMIENTOS (H) AL MOMENTO
							//CALCULA PUNTAJE HASTA EL MOMENTO
		
		
		System.out.println("==============================================================");
		System.out.println("=================  TABLERO  DE EFECTIVOS PKS  ================");
		System.out.println("= 0   1   2   3   4   5   6   7   8   9   10  11  12  13  14 =");
		System.out.println("____________________________________________________________");
		
		if (check==true) {
			matrizghost[filahuevo][columnahuevo]='H';		
			
		} 
		
					
				
		for (int i = 0; i < 15; i++) {  //DIBUJA EL TABLERO
			for (int j = 0; j < 15; j++) {
							
					System.out.print("|");
					System.out.print("_" + matrizghost[i][j]+ "_");
		
				
			}
			System.out.println("|"+i);
			
	 	}
		

		
	}//FIN MOSTRAR MATRIZ
	


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


	public ArrayList<Carro> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(ArrayList<Carro> vehiculos) {
		this.vehiculos = vehiculos;
	}


	public ArrayList<Huevo> getProyectiles() {
		return proyectiles;
	}


	public void setProyectiles(ArrayList<Huevo> proyectiles) {
		this.proyectiles = proyectiles;
	}
	
	public char [][] getMatrizghost() {
		return matrizghost;
	}
	
	
}//FIN CLASE
