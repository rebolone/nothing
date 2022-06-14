package sv.com.cuscatlan.fabrica.service;

import sv.com.cuscatlan.fabrica.domain.Protocols;
import sv.com.cuscatlan.fabrica.domain.Uri;

public class ParseUri {
	
	public static Uri getUriObject(String uri) {
		var myUri = new  Uri("https://www.cnn.com");
		myUri.host = "www.cnn.com";
		myUri.port = 443;
		myUri.protocolo = Protocols.HTTPS;
		return myUri;
	}
}
