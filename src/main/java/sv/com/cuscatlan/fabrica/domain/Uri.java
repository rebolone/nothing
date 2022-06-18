package sv.com.cuscatlan.fabrica.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;

@Data public class Uri {
	public Uri(String uri) throws Exception {
		if(validarUri(uri)) parseUri(uri);
		else throw new Exception("Uri no posee formato correcto");
	
	}
	private String uri;
	private String url;
	private String host;
	private int port;
	private String ipAddress;
	private Protocols protocolo;
	
	private boolean validarUri(String uri) {
		String regex = "^(https?|kafka|tcp|mail)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		try {
            Pattern patt = Pattern.compile(regex);
            Matcher matcher = patt.matcher(uri);
            return matcher.matches();
        } catch (Exception e) {
        	return false;
        }   
	}
	
	private void parseUri(String uri) {
		url = "http://www.cnn.com";
		host = "www.cnn.com";
		port = 80;
		protocolo = Protocols.HTTP;
		
	}
	
}
