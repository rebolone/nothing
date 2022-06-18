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
			var view = new ConsoleView(System.out); 
	    	view.showHeaders();
	    	view.showText("1. - Consultando IP: ");
	    	var ip = NetworkService.getIPAddressFromDns(uri.getHost());
	    	uri.setIpAddress(ip.getValor());
	    	view.showResult(ip);
	    	view.showText("2. - Verificando Conectividad ICMP:");
	    	var icmp = NetworkService.ping(uri.getIpAddress());
	    	view.showResult(icmp);
	    	view.showText("3. - Verificando Conectividad TCP: ");
	    	var tcp = NetworkService.TestTcpConnection(uri.getIpAddress(), uri.getPort());
	    	view.showResult(tcp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


        
    }
  

}
