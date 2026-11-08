public class Main {
    public static void main(String[] args) {
        ChatBot nova = new ChatBot("Nova");

        System.out.println(nova.reply("Java"));
        System.out.println(nova.reply("OOP"));
        System.out.println("Messages answered: " + nova.messagesAnswered);
    }
}

class ChatBot {
    String name;
    int messagesAnswered;

    ChatBot(String name) {
        this.name = name;
        this.messagesAnswered = 0;
    }

    String reply(String question) {
        messagesAnswered++;
        return name + ": Great question about " + question + "!";
    }
}
