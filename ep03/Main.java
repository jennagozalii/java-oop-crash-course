public class Main {
    public static void main(String[] args) {
        ChatBot nova = new ChatBot();
        nova.name = "Nova";
        nova.personality = "friendly";

        ChatBot max = new ChatBot();
        max.name = "Max";
        max.personality = "sarcastic";

        nova.greet();
        max.greet();
    }
}

class ChatBot {
    String name;
    String personality;

    void greet() {
        System.out.println("Hi! I'm " + name + ", your " + personality + " assistant.");
    }
}
