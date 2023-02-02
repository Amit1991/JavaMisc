package designPatterns.prototype.one;

public class GrizzlyBear {

	private boolean isDangerous;
	private String livesIn;
	private Message message;

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public void setLivesIn(String livesIn) {
		this.livesIn = livesIn;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public GrizzlyBear(boolean isDangerous, String livesIn, Message message) {

		this.isDangerous = isDangerous;
		this.livesIn = livesIn;
		this.message = message;
	}

	private static GrizzlyBear defaultBear = new GrizzlyBear(true, "wilderness", new Message("I can tear your torso apart you puny human!"));

	public static GrizzlyBear getPrototype() {

		Message m = new Message();
		m.setMessage(defaultBear.getMessage().getMessage());
		return new GrizzlyBear(defaultBear.isDangerous(), defaultBear.getLivesIn(), m);
	}

	@Override
	public String toString() {
		return "GrizzlyBear [isDangerous=" + isDangerous + ", " + (livesIn != null ? "livesIn=" + livesIn + ", " : "")
				+ (message != null ? "message=" + message + " / " + message.hashCode() : "") + "]";
		
	}
}
