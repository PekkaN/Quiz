import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UI {
    private Scanner reader;
    private QuestionDatabase db;

    public UI() {
        this.db = new QuestionDatabase();
    }

    public void run(Scanner s) {
        this.reader = s;
        ReadWrite rw = new ReadWrite();
        Map<String, Boolean> qMap = rw.readQuestions("data/questions.txt");
        for (String ss : qMap.keySet()) {
            db.addQuestion(new Question(ss, qMap.get(ss)));
        }
        db.randomizeTenQuestions();
        System.out.println("Enter your name: ");
        String name = reader.nextLine();
        int counter = 0;
        for(Question q : db.getQuestions()) {
            System.out.println(q.getQuestion());
            System.out.println("(t)rue or (f)alse");
            String answer = reader.nextLine();
            Boolean banswer = true;
            if(answer.equalsIgnoreCase("f")) {
                banswer = false;
            }
            else if(answer.equalsIgnoreCase("t")) {
                banswer = true
            }

            if(q.isAnswer() == banswer) {
                System.out.println("Correct!");
                counter++;
            }
            else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Your results " + name + ", " + counter+"/10");
    }
}
