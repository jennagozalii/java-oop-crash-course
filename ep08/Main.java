import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot("Nova", new StudyBuddyModel());

        System.out.println("Nova: Hi! Ask me about Java OOP. Type bye to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("bye")) break;
            System.out.println(bot.chat(input));
        }

        System.out.println("Nova: You asked " + bot.getQuestionCount() + " questions. Happy coding!");
        scanner.close();
    }
}

interface AIModel {
    String answer(String question);
}

class StudyBuddyModel implements AIModel {
    @Override
    public String answer(String question) {
        String q = question.toLowerCase();
        if (q.contains("class")) return "A class is a blueprint for objects.";
        if (q.contains("object")) return "An object is one thing built from a class.";
        if (q.contains("inheritance")) return "Inheritance lets one class reuse another.";
        if (q.contains("interface")) return "An interface is a contract of methods.";
        return "Try asking about class, object, inheritance or interface!";
    }
}

class ChatBot {
    private final String name;
    private final AIModel model;
    private final ArrayList<String> history = new ArrayList<>();

    ChatBot(String name, AIModel model) {
        this.name = name;
        this.model = model;
    }

    String chat(String question) {
        history.add(question);
        return name + ": " + model.answer(question);
    }

    int getQuestionCount() {
        return history.size();
    }
}
