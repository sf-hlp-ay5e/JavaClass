
public class Performer {
	/*% Why does id need to be public, should everyone be able to access it directly? %*/
	public int id;

	
	/*% This is never used %*/
	public Performer () {
	}

	public Performer (int id) {
		this.id = id;
	}

	public void perform () {
		System.out.println(id + " - performer");
	}
	
}
