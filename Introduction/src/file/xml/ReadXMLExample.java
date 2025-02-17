package file.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/*
Giải thích:
DocumentBuilderFactory và DocumentBuilder: Được sử dụng để phân tích cú pháp (parse) file XML và tạo đối tượng Document.
Document: Đại diện cho cấu trúc cây của tài liệu XML.
getElementsByTagName("user"): Lấy danh sách các thẻ <user>.
NodeList: Danh sách các node (ở đây là các thẻ <user>).
Element: Đại diện cho một thẻ trong XML, dùng để lấy nội dung bên trong các thẻ con (<id>, <name>, <email>).
getTextContent(): Lấy nội dung văn bản bên trong thẻ.
 */
public class ReadXMLExample {
    public static void main(String[] args) {
        try {
            // Đường dẫn đến file XML
            String filePath = "src/file/data.xml";
            
            // Bước 1: Tạo đối tượng DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Bước 2: Parse file XML và chuyển thành đối tượng Document
            Document document = builder.parse(filePath);
            document.getDocumentElement().normalize();
            
            // Bước 3: Đọc các thẻ <user>
            NodeList nodeList = document.getElementsByTagName("user");
            
            // Bước 4: Duyệt qua các thẻ <user>
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    // Lấy giá trị của các thẻ con <id>, <name>, <email>
                    String id = element.getElementsByTagName("id").item(0).getTextContent();
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String email = element.getElementsByTagName("email").item(0).getTextContent();
                    
                    // In ra thông tin người dùng
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Email: " + email);
                    System.out.println("---------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
