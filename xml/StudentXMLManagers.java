import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class StudentXMLManagers {
    private static final String FILE_NAME = "students.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== QUẢN LÝ SINH VIÊN XML ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    deleteStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }


    private static void addStudent(Scanner scanner) {
        try {
            System.out.print("Nhập ID: ");
            String id = scanner.nextLine();
            System.out.print("Nhập Tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập Tuổi: ");
            String age = scanner.nextLine();
            System.out.print("Nhập Ngành: ");
            String major = scanner.nextLine();

            File file = new File(FILE_NAME);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;
            Element root;

            if (file.exists()) {
                doc = builder.parse(file);
                root = doc.getDocumentElement();
            } else {
                doc = builder.newDocument();
                root = doc.createElement("students");
                doc.appendChild(root);
            }

            Element student = doc.createElement("student");
            student.setAttribute("id", id);
            student.appendChild(createElement(doc, "name", name));
            student.appendChild(createElement(doc, "age", age));
            student.appendChild(createElement(doc, "major", major));

            root.appendChild(student);
            saveToFile(doc);
            System.out.println("Đã thêm sinh viên.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void deleteStudent(Scanner scanner) {
        try {
            System.out.print("Nhập ID sinh viên cần xóa: ");
            String idToDelete = scanner.nextLine();
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("File XML không tồn tại!");
                return;
            }

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(file);
            NodeList studentList = doc.getElementsByTagName("student");
            boolean found = false;

            for (int i = 0; i < studentList.getLength(); i++) {
                Element student = (Element) studentList.item(i);
                if (student.getAttribute("id").equals(idToDelete)) {
                    student.getParentNode().removeChild(student);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveToFile(doc);
                System.out.println("Đã xóa sinh viên có ID: " + idToDelete);
            } else {
                System.out.println("Không tìm thấy sinh viên.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cập nhật thông tin sinh viên theo ID
    private static void updateStudent(Scanner scanner) {
        try {
            System.out.print("Nhập ID sinh viên cần cập nhật: ");
            String idToUpdate = scanner.nextLine();
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("File XML không tồn tại!");
                return;
            }

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(file);
            NodeList studentList = doc.getElementsByTagName("student");
            boolean found = false;

            for (int i = 0; i < studentList.getLength(); i++) {
                Element student = (Element) studentList.item(i);
                if (student.getAttribute("id").equals(idToUpdate)) {
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    String newAge = scanner.nextLine();
                    System.out.print("Nhập ngành mới: ");
                    String newMajor = scanner.nextLine();

                    student.getElementsByTagName("name").item(0).setTextContent(newName);
                    student.getElementsByTagName("age").item(0).setTextContent(newAge);
                    student.getElementsByTagName("major").item(0).setTextContent(newMajor);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveToFile(doc);
                System.out.println("Đã cập nhật sinh viên.");
            } else {
                System.out.println("Không tìm thấy sinh viên.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void saveToFile(Document doc) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(FILE_NAME));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Tạo phần tử XML
    private static Element createElement(Document doc, String name, String value) {
        Element element = doc.createElement(name);
        element.appendChild(doc.createTextNode(value));
        return element;
    }

}