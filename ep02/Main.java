public class Main {
    public static void main(String[] args) {
        String botName = "Nova";
        int version = 2;
        double confidence = 0.95;
        boolean isOnline = true;

        System.out.println(botName + " v" + version + " is online: " + isOnline);

        if (confidence > 0.9) {
            System.out.println("High confidence answer!");
        } else {
            System.out.println("Let me double-check...");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Thinking... " + i);
        }
    }
}
