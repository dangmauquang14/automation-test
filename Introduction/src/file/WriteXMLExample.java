package file;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
/*
Tạo tài liệu XML: Sử dụng DocumentBuilderFactory và DocumentBuilder để tạo tài liệu XML trống.
Tạo thẻ gốc <users>: Đây là thẻ gốc bao quanh tất cả các thẻ người dùng.
Tạo thẻ <user>: Thêm thông tin người dùng bên trong thẻ <users>.
Tạo các thẻ con <id>, <name>, <email>: Chứa thông tin chi tiết về người dùng.
Ghi file XML: Sử dụng Transformer để ghi cấu trúc XML trên thành file output.xml tại đường dẫn src/file/output.xml.
 */

public class WriteXMLExample {
    public static void main(String[] args) {
        // Đường dẫn lưu file XML
        String filePath = "src/file/output.xml";

        try {
            // Bước 1: Tạo DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            // Bước 2: Tạo thẻ gốc <users>
            Element root = document.createElement("users");
            document.appendChild(root);

            // Bước 3: Tạo thẻ <user>
            Element user = document.createElement("user");
            root.appendChild(user);

            // Bước 4: Tạo các thẻ con <id>, <name>, <email>
            Element id = document.createElement("id");
            id.appendChild(document.createTextNode("1"));
            user.appendChild(id);

            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("John Doe"));
            user.appendChild(name);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("john@example.com"));
            user.appendChild(email);

            // Bước 5: Ghi nội dung ra file XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);

            System.out.println("Ghi file XML thành công!");
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
