package adapter.exempluSeminar;

public class AdapterClassXmlToJson extends XmlParser implements JsonParser{



    @Override
    public void parseJson(String json) {
        this.parseXML(json);
    }
}
