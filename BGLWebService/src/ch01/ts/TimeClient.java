package ch01.ts;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		//URL url = new URL("http://localhost:9901/ts?wsdl");
		URL url = new URL("http://localhost:8888/ts?wsdl");
		QName qname = new QName("http://ts.ch01/","TimeServerImplService");
		
		Service service = Service.create(url, qname);
		
		TimeServer eif = service.getPort(TimeServer.class);
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}

}
