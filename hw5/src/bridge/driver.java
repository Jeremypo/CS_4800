package bridge;

public class driver {
	public static void main(String[] args) {
	     MessageType text = new Text();
	     MessageType image = new Image(); 
	     MessageType video = new Video(); 
	     
	     text.setMessageApp(new WhatsApp());
	     image.setMessageApp(new Telegram());
	     video.setMessageApp(new Facebook());
	     
	     text.setContent("Jeremy");
	     text.sendMessage();
	     
	     image.setContent("Jeremy.png");
	     image.sendMessage();
	     
	     video.setContent("Jeremy.mp4");
	     video.sendMessage();
	}
}
