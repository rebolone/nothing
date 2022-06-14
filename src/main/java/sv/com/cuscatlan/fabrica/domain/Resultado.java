package sv.com.cuscatlan.fabrica.domain;

public class Resultado
{
	public Resultado(boolean success, String mensaje, String tiempo) {
		this.success = success;
		this.mensaje = mensaje;
		this.tiempo = tiempo;
	}
	public boolean success;
	public String mensaje;
	public String tiempo;
}
