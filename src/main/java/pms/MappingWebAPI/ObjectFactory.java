package pms.MappingWebAPI;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private final static QName _IntelligentMappingRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "IntelligentMappingRS");
    private final static QName _MappingStatusSearchRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MappingStatusSearchRS");
    private final static QName _SetMappingRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SetMappingRS");
    private final static QName _MappingStatusSearchRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MappingStatusSearchRQ");
    private final static QName _SetMappingRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "SetMappingRQ");
    private final static QName _IntelligentMappingRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "IntelligentMappingRQ");

    public ObjectFactory() {
    }

    public GetRoomProductInfoResponse createGetRoomProductInfoResponse() {
        return new GetRoomProductInfoResponse();
    }

    public ProductMappingInfoRS createProductMappingInfoRS() {
        return new ProductMappingInfoRS();
    }

    public GetCtripSubHotelInfoByEBKResponse createGetCtripSubHotelInfoByEBKResponse() {
        return new GetCtripSubHotelInfoByEBKResponse();
    }

    public CtripSubHotelInfoByEBKRS createCtripSubHotelInfoByEBKRS() {
        return new CtripSubHotelInfoByEBKRS();
    }

    public RoomMatchRS createRoomMatchRS() {
        return new RoomMatchRS();
    }

    public MappingStatusSearchRS createMappingStatusSearchRS() {
        return new MappingStatusSearchRS();
    }

    public MappingStatusSearchRQ createMappingStatusSearchRQ() {
        return new MappingStatusSearchRQ();
    }

    public GetCtripSubHotelInfoByEBK createGetCtripSubHotelInfoByEBK() {
        return new GetCtripSubHotelInfoByEBK();
    }

    public CtripSubHotelInfoByEBKRQ createCtripSubHotelInfoByEBKRQ() {
        return new CtripSubHotelInfoByEBKRQ();
    }

    public GetRoomProductInfo createGetRoomProductInfo() {
        return new GetRoomProductInfo();
    }

    public SetMappingRQ createSetMappingRQ() {
        return new SetMappingRQ();
    }

    public RoomMatchRQ createRoomMatchRQ() {
        return new RoomMatchRQ();
    }

    public SetMappingRS createSetMappingRS() {
        return new SetMappingRS();
    }

    public GetCtripSubHotelInfo createGetCtripSubHotelInfo() {
        return new GetCtripSubHotelInfo();
    }

    public GetCtripSubHotelInfoResponse createGetCtripSubHotelInfoResponse() {
        return new GetCtripSubHotelInfoResponse();
    }

    public CtripSubHotelInfoRS createCtripSubHotelInfoRS() {
        return new CtripSubHotelInfoRS();
    }

    public ArrayOfMatch createArrayOfMatch() {
        return new ArrayOfMatch();
    }

    public RoomProductInfo createRoomProductInfo() {
        return new RoomProductInfo();
    }

    public ArrayOfSearchProductInfo createArrayOfSearchProductInfo() {
        return new ArrayOfSearchProductInfo();
    }

    public OtaProductInfo createOtaProductInfo() {
        return new OtaProductInfo();
    }

    public Match createMatch() {
        return new Match();
    }

    public Data createData() {
        return new Data();
    }

    public ArrayOfOtaProductInfo createArrayOfOtaProductInfo() {
        return new ArrayOfOtaProductInfo();
    }

    public ArrayOfData createArrayOfData() {
        return new ArrayOfData();
    }

    public HotelInfo createHotelInfo() {
        return new HotelInfo();
    }

    public ArrayOfProductSearchResult createArrayOfProductSearchResult() {
        return new ArrayOfProductSearchResult();
    }

    public ProductSearchResult createProductSearchResult() {
        return new ProductSearchResult();
    }

    public ArrayOfRoomProductInfo createArrayOfRoomProductInfo() {
        return new ArrayOfRoomProductInfo();
    }

    public ArrayOfHotelInfo createArrayOfHotelInfo() {
        return new ArrayOfHotelInfo();
    }

    public SearchProductInfo createSearchProductInfo() {
        return new SearchProductInfo();
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "IntelligentMappingRS")
    public JAXBElement<RoomMatchRS> createIntelligentMappingRS(RoomMatchRS value) {
        return new JAXBElement<RoomMatchRS>(_IntelligentMappingRS_QNAME, RoomMatchRS.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MappingStatusSearchRS")
    public JAXBElement<MappingStatusSearchRS> createMappingStatusSearchRS(MappingStatusSearchRS value) {
        return new JAXBElement<MappingStatusSearchRS>(_MappingStatusSearchRS_QNAME, MappingStatusSearchRS.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SetMappingRS")
    public JAXBElement<SetMappingRS> createSetMappingRS(SetMappingRS value) {
        return new JAXBElement<SetMappingRS>(_SetMappingRS_QNAME, SetMappingRS.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MappingStatusSearchRQ")
    public JAXBElement<MappingStatusSearchRQ> createMappingStatusSearchRQ(MappingStatusSearchRQ value) {
        return new JAXBElement<MappingStatusSearchRQ>(_MappingStatusSearchRQ_QNAME, MappingStatusSearchRQ.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "SetMappingRQ")
    public JAXBElement<SetMappingRQ> createSetMappingRQ(SetMappingRQ value) {
        return new JAXBElement<SetMappingRQ>(_SetMappingRQ_QNAME, SetMappingRQ.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "IntelligentMappingRQ")
    public JAXBElement<RoomMatchRQ> createIntelligentMappingRQ(RoomMatchRQ value) {
        return new JAXBElement<RoomMatchRQ>(_IntelligentMappingRQ_QNAME, RoomMatchRQ.class, null, value);
    }
}