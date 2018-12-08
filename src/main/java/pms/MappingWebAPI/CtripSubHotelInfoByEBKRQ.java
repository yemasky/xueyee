package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtripSubHotelInfoByEBKRQ", propOrder = {"name", "password"})
public class CtripSubHotelInfoByEBKRQ {
    protected String name;
    protected String password;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }
}