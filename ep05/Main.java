public class Main {
    public static void main(String[] args) {
        AIAccount account = new AIAccount("sk-demo-1234abcd", 2);

        System.out.println("Key: " + account.getMaskedKey());
        account.ask("What is Java?");
        account.ask("What is OOP?");
        account.ask("One more?");
        System.out.println("Credits left: " + account.getCredits());

        // account.credits = 999;
    }
}

class AIAccount {
    private String apiKey;
    private int credits;

    AIAccount(String apiKey, int credits) {
        this.apiKey = apiKey;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getMaskedKey() {
        return "****" + apiKey.substring(apiKey.length() - 4);
    }

    public void ask(String prompt) {
        if (credits <= 0) {
            System.out.println("Out of credits! Please top up.");
            return;
        }
        credits--;
        System.out.println("Answering: " + prompt);
    }
}
