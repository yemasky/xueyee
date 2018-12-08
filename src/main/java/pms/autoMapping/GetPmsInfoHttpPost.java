package pms.autoMapping;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "GetPmsInfoHttpPost")
@XmlSeeAlso({ObjectFactory.class})
public interface GetPmsInfoHttpPost {
}