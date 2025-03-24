import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserExample {
    public static void main(String[] args) {
        try {
            // Tạo SAXParserFactory và SAXParser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // Tạo handler để xử lý sự kiện SAX
            DefaultHandler handler = new DefaultHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    System.out.println("Start Element: " + qName);
                }

                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End Element: " + qName);
                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    String content = new String(ch, start, length).trim(); // Xóa khoảng trắng
                    if (!content.isEmpty()) { // Chỉ in nếu không rỗng
                        System.out.println("Characters: " + content);
                    }
                }

            };

            // Đọc tài liệu XML
            saxParser.parse("products.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}