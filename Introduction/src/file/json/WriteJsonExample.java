package file.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import file.xml.User;

import java.io.File;
import java.io.IOException;

public class WriteJsonExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        //Tạo đối tượng User:
        User user = new User();
        user.setName("Jane Doe");
        user.setAge(29);

        try {
            // Ghi đối tượng User thành JSON ra file
            mapper.writeValue(new File("src/file/output.json"), user);
            System.out.println("Đã ghi JSON ra file output.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}