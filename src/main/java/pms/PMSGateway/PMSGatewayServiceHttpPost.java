package pms.PMSGateway;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSGatewayServiceHttpPost")
@XmlSeeAlso({ObjectFactory.class})
public interface PMSGatewayServiceHttpPost {
}
