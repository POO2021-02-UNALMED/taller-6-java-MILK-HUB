package vehiculos;

public class Camioneta extends Vehiculo {

	private Boolean volco;
	private static int camionetas; 
	
	
	
	
	public Camioneta() {
		camionetas++;
	}
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4x4", fabricante);
		this.volco = volco;
		camionetas++;
	
	}	

	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return camionetas;
	}

}

