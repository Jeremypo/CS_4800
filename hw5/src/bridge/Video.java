package bridge;

public class Video implements MessageType {
    private MessagingApp messagingApp;
    private String content;

    public void setMessageApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaType() {
        return "Video";
    }

    public String getContent() {
        return content;
    }

    public void sendMessage() {
        if (messagingApp != null) {
            messagingApp.sendMessage("Video: " + content);
            System.out.println("Video sent: " + content);
        }
    }
}