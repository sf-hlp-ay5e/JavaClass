/*% All features should be unit tested %*/
public class Audition {
	public static void main(String[] args) {
		/*% Try to use plurals for variable names when they reference a group of things %*/
		Performer[] performer = new Performer[7];
		/*% good use of encapsulation %*/
		performer[0] = new Performer(1);
		performer[1] = new Performer(2);
		performer[2] = new Performer(3);
		performer[3] = new Performer(4);
		performer[4] = new Dancer(5, DanceStyle.TAP);
		performer[5] = new Dancer(6, DanceStyle.SQUARE);
		performer[6] = new Vocalist(7, MusicalKey.C);
		
		int i;
		/*% Initialize i inside the for loop ex. for(int i = 0 ....) %*/
		for (i = 0; i < performer.length; i++) {
			performer[i].perform();
		}
		
		Vocalist vocalist = (Vocalist) performer[6];
		vocalist.perform(8);
	}

}
