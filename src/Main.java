import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        FileReader reader = new FileReader("students.json");

        Students student = mapper.readValue(reader, Students.class);

        System.out.println(student);

    }
}