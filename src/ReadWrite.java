import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadWrite {

    public Map<String, Boolean> readQuestions(String path) {
        Map<String, Boolean> questionList = new HashMap<>();
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] questionSplit = line.split("!/!");
                questionList.put(questionSplit[0], Boolean.parseBoolean(questionSplit[1]));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return questionList;
    }

}
