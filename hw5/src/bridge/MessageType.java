package bridge;

public interface MessageType {
    void setMessageApp(MessagingApp messagingApp);
    void setContent(String content); 
    String getMediaType();
    String getContent();
    void sendMessage();
}