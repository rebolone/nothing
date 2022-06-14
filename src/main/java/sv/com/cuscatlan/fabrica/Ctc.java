package sv.com.cuscatlan.fabrica;

import java.net.InetAddress;
import java.net.UnknownHostException;

import sv.com.cuscatlan.fabrica.service.NetworkService;
import sv.com.cuscatlan.fabrica.view.ConsoleView;

/**
 * Hello world!
 *
 */
public class Ctc 
{
	

	
    public static void main( String[] args )
    {
    	ConsoleView.showHeaders(System.out);
    	System.out.println("Iniciando Verificación de Conectividad....");
    	System.out.println("");
    	var ip = NetworkService.GetIPAddressFromDns("www.cnn.com");
    	System.out.println(ip.mensaje);

        
    }
  

}
