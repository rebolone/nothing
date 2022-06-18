package sv.com.cuscatlan.fabrica;

import sv.com.cuscatlan.fabrica.domain.Uri;
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
    	Uri uri;
		try {
			uri = new Uri("http://www.google.com");
	    	ConsoleView.showHeaders(System.out);
	    	System.out.println("Iniciando Verificación de Conectividad....");
	    	System.out.println("");
	    	var ip = NetworkService.getIPAddressFromDns(uri.getHost());
	    	uri.setIpAddress(ip.getValor());
	    	System.out.println(ip.getMensaje());
	    	NetworkService.ping(uri.getIpAddress());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


        
    }
  

}
