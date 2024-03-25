package bridge;

public class Facebook implements MessagingApp {
    public void sendMessage(String content) {
        System.out.println("Facebook: " + content);
    }
}