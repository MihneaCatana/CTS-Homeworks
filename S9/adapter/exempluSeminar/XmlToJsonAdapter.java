package adapter.exempluSeminar;

public class XmlToJsonAdapter implements  JsonParser{

    private XmlParser xmlParser;

    public XmlToJsonAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public void parseJson(String json) {
//    String xml =
        xmlParser.parseXML(json);
    }


}
