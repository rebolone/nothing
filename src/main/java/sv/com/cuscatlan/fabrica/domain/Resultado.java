package sv.com.cuscatlan.fabrica.domain;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Builder
@Data public class Resultado
{
	private  final boolean success;
	private  final String mensaje;
	private  final String tiempo;
	private  final String valor;
}
