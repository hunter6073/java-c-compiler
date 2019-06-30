package parser;

public class Record {
	private String name=null;
	private String value=null;
	private static String type="int";

	
	
	public Record(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
