package bridge;

public class Image implements MessageType {
	private MessagingApp messagingApp;
    private String content;

    public void setMessageApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaType() {
        return "Image";
    }

    public String getContent() {
        return content;
    }

    public void sendMessage() {
        if (messagingApp != null) {
            messagingApp.sendMessage("Image: " + content);
            System.out.println("Image sent: " + content);
        }
    }
}