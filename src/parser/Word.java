package parser;


public class Word {
	private int kind;
	private String name;
	public Word()
	{
		
	}
	public Word(String name, int kind) {
		super();
		this.name = name;
		this.kind= kind;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind =kind;
	}
	public String toString()
	{
		String s="( "+name+"  "+kind+" )\r\n ";
		return s;
	}

}
