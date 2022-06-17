/**
 * 
 */
package sv.com.cuscatlan.fabrica.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

import sv.com.cuscatlan.fabrica.domain.Resultado;
import sv.com.cuscatlan.fabrica.domain.Uri;

/**R
 * @author William
 *
 */
public class NetworkService {


	public static Resultado getIPAddressFromDns(String hostname) {
		InetAddress address;
		try {
			address = InetAddress.getByName(hostname);
	    	return Resultado.builder().build();
	    		.(true, String.format("La IP asociada al Host %1$s es la %2$s", hostname, address.getHostAddress()),"1 min");
		} catch (UnknownHostException e) {
			return new Resultado(false, "El Host procesado es desconocido....","1 min");
		}  catch (Exception e) {
			return new Resultado(false, "Se genero un error y no fue posible identificar la IP del Host","1 min");
		}
		return uri;
	}
	
	public static void ping(String ip) {
	    try {
	        Process p = Runtime.getRuntime().exec(String.format("ping %1$s",ip));
	        BufferedReader inputStream = new BufferedReader(
	                new InputStreamReader(p.getInputStream()));

	        String s = "";
	        while ((s = inputStream.readLine()) != null) {
	            System.out.println(s);
	        }

	    } catch (Exception e) {
	    	System.out.println("Error ICMP");
	        e.printStackTrace();
	    }
	}

}
