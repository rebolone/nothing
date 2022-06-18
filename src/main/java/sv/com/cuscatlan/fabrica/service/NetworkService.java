/**
 * 
 */
package sv.com.cuscatlan.fabrica.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
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
	
	public static Resultado	ping(String ip) {
		int colon1,colon2, colon3;
		String mensaje = "";
	    try {
	    	String command = String.format("ping %1$s",ip);
	        Process p = Runtime.getRuntime().exec(command);
	        BufferedReader inputStream = new BufferedReader(
	                new InputStreamReader(p.getInputStream()));
	        String s = "";
	        while ((s = inputStream.readLine()) != null) {
	        	if(s.trim().startsWith("Packets:")) {
	        		colon1 = s.indexOf(",", 0);
	        		colon2 = s.indexOf(",", colon1 + 1);
	        		colon3 = s.indexOf(",", colon2 + 1);
	        		var sent = s.substring(s.indexOf("=",0) + 1,  colon1);
	        		var received = s.substring(s.indexOf("=",colon1 + 1) + 1,  colon2);
	        		var lost = s.substring(s.indexOf("=",colon2 + 1) + 1,  colon3);
	        		mensaje = String.format("Paquetes Enviados %s, Paquetes Recividos: %s, Paquetes Perdidos:%s ", sent, received, lost);

	        	}
	        } 
    		return new Resultado(true,mensaje,"Exitoso","");
	    } catch (Exception e) {
	    	return new Resultado(false,"Error verificando ICMP","Error","");
	    }
	}
	
	 public static Resultado TestTcpConnection(String ip, int port) {
		 Socket clientSocket;
		try {
			clientSocket = new Socket(ip, port);
			if(!clientSocket.isConnected()) {
				clientSocket.close();
				return new Resultado(false, String.format("Puerto TCP %s no esta respondiendo correctamente en Ip %s",port, ip),"Exito","");
			} 
			clientSocket.close();
			return new Resultado(true, String.format("Puerto TCP %s respondiendo correctamente en Ip %s",port, ip),"Exito","");
		} catch (IOException e) {
			return new Resultado(false, String.format("Error verificando puerto TCP %s en Ip %s",port, ip),"Falla","");

		}
	    }
	

}
