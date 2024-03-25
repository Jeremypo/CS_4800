package bridge;

public class Text implements MessageType {
    private MessagingApp messagingApp;
    private String content;

    public void setMessageApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaType() {
        return "Text";
    }

    public String getContent() {
        return content;
    }

    public void sendMessage() {
        if (messagingApp != null) {
            messagingApp.sendMessage("Text: " + content);
        }
    }
}
