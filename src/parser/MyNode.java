package parser;


public class MyNode {

	public String name;
	public String type;
	public int D;
	public boolean isArray;
	public int result;
	public int row;
	public int col;
	public int rflag,cflag; 
	public int a[]=null ;
	public int b[][]=null;
	
	public MyNode(String name, String type) {
		super();
		this.name = name;
		this.type = type;
		this.row=0;
		this.col=0;
		this.rflag=0;
		this.cflag=0;
	}
	
	public boolean isArray() {
		if(this.D==0){
			isArray=false;
		}else{
			isArray=true;
		}
		return isArray;
	}

	
	
	
	
}
