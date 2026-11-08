public class Main {
    public static void main(String[] args) {
        TutorBot ava = new TutorBot("Ava", "Java");

        ava.greet();
        ava.teach();
    }
}

class ChatBot {
    protected String name;

    ChatBot(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hi, I'm " + name + ".");
    }
}

class TutorBot extends ChatBot {
    private String subject;

    TutorBot(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject + "!");
    }
}
