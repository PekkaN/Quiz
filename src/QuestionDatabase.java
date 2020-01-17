import java.util.*;

public class QuestionDatabase {

    private List<Question> qList;

    public QuestionDatabase() {
        this.qList = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        this.qList.add(q);
    }
    public List<Question> getQuestions() {
        return this.qList;
    }
    public void randomizeTenQuestions() {
        Collections.shuffle(qList);
        Iterator<Question> ite = qList.iterator();
        int i = 0;
        while(ite.hasNext()) {
            if(qList.size()>=11){
                ite.next();
                ite.remove();
            }
            else {
                break;
            }
        }


    }
    public void saveQuestions(Map<String, Boolean> m) {
        for(String s : m.keySet()) {
            qList.add(new Question(s, m.get(s)));
        }
    }
}
