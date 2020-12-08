import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.somePack.one.Student;

public class SecondMain {

    public static void main(String[] args) throws JsonProcessingException {

        String string = "{\"name\":\"john\",\"lName\":null,\"sex\":false,\"birthday\":null,\"gpa\":0}";

        ObjectMapper mapper = new ObjectMapper();

        Student s = mapper.readValue(string, Student.class);

        System.out.println(s);

    }

}
