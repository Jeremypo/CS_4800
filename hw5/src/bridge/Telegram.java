package bridge;

public class Telegram implements MessagingApp {
    public void sendMessage(String content) {
        System.out.println("Telegram: " + content);
    }
}
