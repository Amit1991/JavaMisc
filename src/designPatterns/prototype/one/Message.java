package designPatterns.prototype.one;

public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [" + (message != null ? "message=" + message : "") + "]";
	}
	
	public Message() {
		
	}
	
	public Message(String message) {
		
		this.message = message;
	}
}