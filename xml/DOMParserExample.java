import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import java.io.File;

public class DOMParserExample {
    public static void main(String[] args) {
        try {
            // Kiểm tra file có tồn tại không
            File xmlFile = new File("products.xml");
            if (!xmlFile.exists()) {
                System.out.println("File products.xml không tồn tại!");
                return;
            }

            // Tạo bộ phân tích XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize(); // Chuẩn hóa dữ liệu

            // Lấy danh sách sản phẩm
            NodeList productList = document.getElementsByTagName("product");

            System.out.println("Danh sách sản phẩm:");
            for (int i = 0; i < productList.getLength(); i++) {
                Node node = productList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element product = (Element) node;
                    String name = product.getElementsByTagName("name").item(0).getTextContent();
                    String price = product.getElementsByTagName("price").item(0).getTextContent();
                    System.out.println("- " + name + ": $" + price);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
