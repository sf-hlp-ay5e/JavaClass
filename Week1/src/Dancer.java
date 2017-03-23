public class Dancer extends Performer {

	private DanceStyle style;
	
	public Dancer (int id, DanceStyle style) {
		/*% use super(arg1,arg2...) instead of treating it like a built object %*/
		super.id = id;
		this.style = style;
	}
	
	/*% It's usually best to return something other than void so you can test easier%*/
	public void perform () {
		System.out.println(style + " - " + id + " - dancer");
	}
}
