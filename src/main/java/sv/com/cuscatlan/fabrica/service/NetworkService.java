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
		try {
			InetAddress address = InetAddress.getByName(hostname);
	    	return new Resultado(true, String.format("La IP asociada al Host %1$s es la %2$s", hostname, address.getHostAddress()),"",address.getHostAddress());
		} catch (UnknownHostException e) {
			return new Resultado(false, "El Host procesado es desconocido....","1 min","");
		}  catch (Exception e) {
			return new Resultado(false, "Se genero un error y no fue posible identificar la IP del Host","1 min","Error");
		}
	}
	
	public static void ping(String ip) {
	    try {
	    	String command = String.format("ping %1$s",ip);
	    	System.out.println(command);
	        Process p = Runtime.getRuntime().exec(command);
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
