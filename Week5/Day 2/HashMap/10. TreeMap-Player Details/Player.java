

public class Player {
	private String capNumber;
	private String name;
	private String team;
	private String skill;

	public Player(String capNumber, String name, String team, String skill) {
		super();
		this.capNumber = capNumber;
		this.name = name;
		this.team = team;
		this.skill = skill;
	}

	public String getCapNumber() {
		return capNumber;
	}

	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
