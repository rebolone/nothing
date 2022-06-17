package sv.com.cuscatlan.fabrica.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data public class Uri {
	private final String uri;
	private String url;
	private String host;
	private int port;
	private String ipAddress;
	private Protocols protocolo;
	
	
}
