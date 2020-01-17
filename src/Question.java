
public class Question {
    private String question;
    private boolean answer;


    public Question(String s, boolean b) {
        this.question = s;
        this.answer = b;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
