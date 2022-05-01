package in.nareshit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("esobj")
public class EmailService {
	   @Value("Gmail")
	   private String host;
	   @Value("587")
	   private int port;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	   
}
