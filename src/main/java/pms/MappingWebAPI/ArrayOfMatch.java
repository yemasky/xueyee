package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMatch", propOrder = {"match"})
public class ArrayOfMatch {
    @XmlElement(name = "Match", nillable = true)
    protected List<Match> match;

    public List<Match> getMatch() {
        if (match == null) {
            match = new ArrayList<Match>();
        }
        return this.match;
    }
}