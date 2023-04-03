
public class Wicket {
	private String playerName;
	private Bowler Bowler;

	public Wicket(String playerName, Bowler bowler) {
		super();
		this.playerName = playerName;
		Bowler = bowler;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Bowler getBowler() {
		return Bowler;
	}

	public void setBowler(Bowler bowler) {
		Bowler = bowler;
	}

}
