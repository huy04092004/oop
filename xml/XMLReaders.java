import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.XMLReader;

public  class XMLReaders{
    public static void  main(String[] args){
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("company.xml");
            document.getDocumentElement().normalize();

            NodeList employees =document.getElementsByTagName("employee");

            for(int i = 0; i < employees.getLength(); i++){
                Element employee=(Element) employees.item(i);

                String id = employee.getAttribute("id");
                String name = employee.getElementsByTagName("name").item(0).getTextContent();
                String email = employee.getElementsByTagName("email").item(0).getTextContent();
                String phone = employee.getElementsByTagName("phone").item(0).getTextContent();
                String departmentName = employee.getElementsByTagName("name").item(1).getTextContent(); // Tên phòng ban
                String location = employee.getElementsByTagName("location").item(0).getTextContent();

                System.out.println("Employee ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
                System.out.println("Department: " + departmentName);
                System.out.println("Location: " + location);
                System.out.println("-------------------------");}
        } catch(  Exception e){
            e.printStackTrace();
        }
    }
}