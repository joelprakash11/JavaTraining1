import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Driverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Players Details :");
		System.out.println();

		ArrayList<TennisPlayer> d = new ArrayList<TennisPlayer>();
		d.add(new TennisPlayer(1, "joel", 10, 3, 2, 6, "Grass", 1));
		d.add(new TennisPlayer(2, "prakash", 15, 5, 6, 1, "Synthatic", 5));
		d.add(new TennisPlayer(3, "kamal", 5, 3, 3, 2, "Clay", 9));
		d.add(new TennisPlayer(4, "Bala", 17, 7, 8, 3, "Others", 6));
		d.add(new TennisPlayer(5, "tharun", 29, 8, 1, 8, "Grass", 7));
		d.add(new TennisPlayer(6, "mohan", 16, 5, 7, 9, "Clay", 6));
		d.add(new TennisPlayer(7, "bharath", 18, 6, 4, 10, "Clay", 3));
		d.add(new TennisPlayer(8, "akash", 11, 8, 7, 7, "Others", 5));
		d.add(new TennisPlayer(9, "yuvi", 13, 8, 9, 4, "Synthatic", 4));
		d.add(new TennisPlayer(10, "kumar", 6, 3, 10, 5, "Grass", 7));

		for (TennisPlayer deatils : d)
			System.out.println(deatils);
		
		System.out.println();
		DeletePlayer(8, d);
		DeletePlayer(13, d);
		System.out.println();
		TennisPlayer.playMatch(1, 2, d);
		TennisPlayer.playMatch(4, 6, d);
		for (TennisPlayer deatils : d)
			System.out.println(deatils);
		System.out.println();
		System.out.println("After Sorting Based on Current Rancking");
		Collections.sort(d);
		for (TennisPlayer deatils : d)
			System.out.println(deatils);
	}

	private static void DeletePlayer(int pl, ArrayList<TennisPlayer> d) {

		TennisPlayer t1 = null;
		boolean del = true;
		for (Iterator<TennisPlayer> iterator = d.iterator(); iterator.hasNext();) {
			TennisPlayer tennisplayer = (TennisPlayer) iterator.next();
			if (tennisplayer.getPlayercode() == pl) {
				t1 = tennisplayer;
				del = false;
			}

		}
		d.remove(t1);
		if (!del)

			System.out.println("After Deleted The Player");
		try {
			if (del)
				throw new PlaayerNotFoundException("Player Not Found");
		} catch (PlaayerNotFoundException e) {
			System.out.println(e);
		}
	}

}
