package bridge;

public class WhatsApp implements MessagingApp {
    public void sendMessage(String content) {
        System.out.println("WhatsApp: " + content);
    }
}
