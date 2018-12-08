package pms.ctripinland;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Invoke createInvoke() {
        return new Invoke();
    }

    public InvokeResponse createInvokeResponse() {
        return new InvokeResponse();
    }
}