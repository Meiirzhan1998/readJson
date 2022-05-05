import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        FileReader reader1 = new FileReader("students.json");
        FileReader reader2 = new FileReader("students2.json");
        FileReader reader3 = new FileReader("students3.json");

        Students studentsSimple = mapper.readValue(reader1, Students.class);
        Students2 studentsArray = mapper.readValue(reader2, Students2.class);
        Students2 studentsNestedArray = mapper.readValue(reader3, Students2.class);

        System.out.println(studentsSimple);
        System.out.println(studentsArray);
        System.out.println(studentsNestedArray);
    }
}