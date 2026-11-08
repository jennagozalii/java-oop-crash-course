public class Main {
    public static void main(String[] args) {
        AIModel[] models = { new RuleBasedModel(), new EchoModel() };

        for (AIModel model : models) {
            System.out.println(model.answer("What is Java?"));
        }
    }
}

interface AIModel {
    String answer(String question);
}

class RuleBasedModel implements AIModel {
    @Override
    public String answer(String question) {
        if (question.toLowerCase().contains("java")) {
            return "Java is an object-oriented language.";
        }
        return "I'm not sure yet.";
    }
}

class EchoModel implements AIModel {
    @Override
    public String answer(String question) {
        return "You asked: " + question;
    }
}
