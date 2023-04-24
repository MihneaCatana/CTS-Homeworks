package adapter.exempluSeminar;

public class Client {

    public static void main(String[] args) {
        XmlParser parser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(parser);
        jsonParser.parseJson("{ \"name\": \"John\", \"age\": 30  }");

        AdapterClassXmlToJson adapter = new AdapterClassXmlToJson();
        adapter.parseJson("{ \"name\": \"Andrew\", \"age\": 20  }");

    }
}
