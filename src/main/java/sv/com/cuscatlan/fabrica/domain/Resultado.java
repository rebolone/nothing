package sv.com.cuscatlan.fabrica.domain;


import lombok.Data;


@Data public class Resultado
{
	private  final boolean success;
	private  final String mensaje;
	private  final String tiempo;
	private  final String valor;
}
