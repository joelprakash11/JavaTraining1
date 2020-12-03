import java.util.ArrayList;
import java.util.Random;

public class TennisPlayer implements Comparable<TennisPlayer> {
	private int playercode;
	private String playerName;
	private PlayerCareer pc;

	public TennisPlayer(int playercode, String playerName, int matchesPlayed, int matchesWon, int currentRanking,
			int bestRanking, String prefferdCort, int lastFought) {
		super();
		this.playercode = playercode;
		this.playerName = playerName;
		this.pc = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking, prefferdCort, lastFought);
	}

	public static void playMatch(int pcode1, int pcode2, ArrayList<TennisPlayer> list) {
		Boolean wins = new Random().nextBoolean();
		TennisPlayer p1 = null, p2 = null;
		for (TennisPlayer tennisPlayer : list) {
			if (tennisPlayer.playercode == pcode1) {
				p1 = tennisPlayer;
			}
			if (tennisPlayer.playercode == pcode2) {
				p2 = tennisPlayer;
			}

		}
		p1.pc.setMatchesPlayed(p1.pc.getMatchesPlayed() + 1);
		p2.pc.setMatchesPlayed(p2.pc.getMatchesPlayed() + 1);

		if (wins) {

			p1.pc.setMatchesWon(p1.pc.getMatchesWon() + 1);
			p1.pc.setCurrentRanking(p1.pc.getCurrentRanking() - 1);
		} else {

			p2.pc.setMatchesWon(p2.pc.getMatchesWon() + 1);
			p2.pc.setCurrentRanking(p2.pc.getCurrentRanking() - 1);
		}
		if (!wins) {
			p1.pc.setCurrentRanking(p1.pc.getCurrentRanking() + 1);
		} else {
			p2.pc.setCurrentRanking(p2.pc.getCurrentRanking() + 1);
		}

	}

	public int getPlayercode() {
		return playercode;
	}

	public String getPlayerName() {
		return playerName;
	}

	public PlayerCareer getCareerdetail() {
		return getCareerdetail();
	}

	@Override
	public String toString() {
		return "TennisPlayer [playercode=" + playercode + ", playerName=" + playerName + "]"
				+ "PlayerCareer[matchesPlayed=" + pc.getMatchesPlayed() + ", matchesWon=" + pc.getMatchesWon()
				+ ", currentRanking=" + pc.getCurrentRanking() + ", bestRanking=" + pc.getBestRanking()
				+ ", prefferdCort=" + pc.getPrefferdCort() + ", lastFought=" + pc.getLastFought() + "]";
	}

	@Override
	public int compareTo(TennisPlayer p) {

		if (this.pc.getCurrentRanking() - p.pc.getCurrentRanking() == 0)
			return (this.playerName.compareTo(p.playerName));
		else

			return this.pc.getCurrentRanking() - (p.pc.getCurrentRanking());
	}

}
