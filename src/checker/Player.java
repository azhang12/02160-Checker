package checker;
public class Player {

	private String Name;
	private int Id;
	
	public Player (String name, int id )
	{
		this.Name = name;
		this.Id=id;
	}
	
	public String getName () {return this.Name;}
	public int getId() {return this.Id;}
}
