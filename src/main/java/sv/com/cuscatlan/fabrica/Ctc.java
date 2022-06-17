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
    	Uri uri = Uri.builder().uri("www.cnn.com").build();
    	ConsoleView.showHeaders(System.out);
    	System.out.println("Iniciando Verificación de Conectividad....");
    	System.out.println("");
    	var ip = NetworkService.getIPAddressFromDns(uri.getHost());
    	//System.out.println(ip.ipAddress);
    	/*NetworkService.ping(ip.mensaje);*/

        
    }
  

}
