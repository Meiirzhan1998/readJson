import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON file to map
//            Map<?, ?> map = mapper.readValue(Paths.get("students.json").toFile(), Map.class);
//            Map<?, ?> map = mapper.readValue(Paths.get("students2.json").toFile(), Map.class);
            Map<?, ?> map = mapper.readValue(Paths.get("students3.json").toFile(), Map.class);

            // print map entries
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
