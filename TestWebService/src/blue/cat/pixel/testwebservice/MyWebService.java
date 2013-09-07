package blue.cat.pixel.testwebservice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://testwebservice.pixel.cat.blue/", endpointInterface = "blue.cat.pixel.testwebservice.MyWebServiceSEI", portName = "MyWebServicePort", serviceName = "MyWebServiceService")
public class MyWebService implements MyWebServiceSEI {
	
	public String whatIsTheAnswer(String input) {
		return new StringBuilder()
				.append("The answer for ")
				.append(input)
				.append(" is hello world!").toString();
	}

}
