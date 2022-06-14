/**
 * 
 */
package sv.com.cuscatlan.fabrica.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import sv.com.cuscatlan.fabrica.domain.Resultado;

/**
 * @author William
 *
 */
public class NetworkService {

	public static Resultado GetIPAddressFromDns(String hostname) {
		InetAddress address;
		try {
			address = InetAddress.getByName(hostname);
	    	return new Resultado(true, String.format("La IP asociada al Host %1$s es la %2$s", hostname, address.getHostAddress()),"1 min");
		} catch (UnknownHostException e) {
			return new Resultado(false, "El Host procesado es desconocido....","1 min");
		}  catch (Exception e) {
			return new Resultado(false, "Se genero un error y no fue posible identificar la IP del Host","1 min");
		}

		
	}
}
