import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QuestionDatabase {
    ReadWrite.()

    private List<Question> qList;

    public QuestionDatabase() {
        this.qList = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        this.qList.add(q);
    }
    public List<Question> getQuestions() {
        randomizeTenQuestions();
        return this.qList;
    }
    public void randomizeTenQuestions() {
        Collections.shuffle(qList);
        for (int i = 0; qList.size() == 10 ; i++) {
            qList.remove(i)
        }
    }
    public void saveQuestions(Map<String, Boolean> m) {
        for(String s : m.keySet()) {
            qList.add(new Question(s, m.get(s)));
        }
    }
}
