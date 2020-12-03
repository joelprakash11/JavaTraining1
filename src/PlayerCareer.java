
public class PlayerCareer {
	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String prefferdCort;
	private int lastFought;

	public PlayerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String prefferdCort,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.prefferdCort = prefferdCort;
		this.lastFought = lastFought;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}

	public void setBestRanking(int bestRanking) {
		this.bestRanking = bestRanking;
	}

	public void setPrefferdCort(String prefferdCort) {
		this.prefferdCort = prefferdCort;
	}

	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public int getCurrentRanking() {
		return currentRanking;
	}

	public int getBestRanking() {
		return bestRanking;
	}

	public String getPrefferdCort() {
		return prefferdCort;
	}

	public int getLastFought() {
		return lastFought;
	}

}
