import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.somePack.one.Student;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        Student s = new Student();

        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(s));

    }

}
