package file.json;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

import file.xml.User;

public class ReadJsonExample {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Đọc JSON và ánh xạ vào lớp Java
		    /*	Đọc file JSON và chuyển đổi sang đối tượng User:
				new File("src/file/user.json"): Đường dẫn tới file JSON cần đọc.
				User.class: Cho Jackson biết cần ánh xạ JSON sang class nào (User).
				readValue(...): Jackson sẽ:
				Đọc nội dung file JSON.
				Ánh xạ các thuộc tính trong JSON sang các thuộc tính tương ứng trong class Use
			*/
			User user = mapper.readValue(new File("src/file/user.json"), User.class);
			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
