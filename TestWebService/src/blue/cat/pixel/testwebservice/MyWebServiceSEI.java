package blue.cat.pixel.testwebservice;

import javax.jws.WebService;

@WebService(name = "MyWebServiceSEI", targetNamespace = "http://testwebservice.pixel.cat.blue/")
public interface MyWebServiceSEI {

	public String whatIsTheAnswer(String input);

}