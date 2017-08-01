package topic1_ex7;
//this class sets and gets states
public enum States {
	PLAY("PLAYING:"),
	STOP("STOPING:");
	
	private final String state;
	
	private States(String state) {
		this.state = state;
	}
	
	public String toString(){
		return state;
	}
}
