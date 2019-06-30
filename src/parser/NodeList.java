package parser;



import java.util.ArrayList;


public class NodeList {
	public ArrayList<MyNode> mylist=null;

	public NodeList(ArrayList<MyNode> mylist) {
		super();
		this.mylist = mylist;
	}
	
	public boolean isExientence(String name){
		boolean index=false;
		
		for(MyNode temp:mylist){
			if(temp.name.equals(name)){
				index=true;
			}
		}
		return index;
	}
	
	public void removeNode(String name){
		
		for(MyNode temp:mylist){
			if(temp.name.equals(name)){
				mylist.remove(temp);
			}
		}
		
	}
	
	public MyNode getNode(String name){
		MyNode temper=null;
		
		for(MyNode temp:mylist){
			if(temp.name.equals(name)){
				temper=temp;
			}
		}
		return temper;
	}
	
	
	public void addNode(MyNode temp){
		mylist.add(temp);
	}
	public void clear()
	{
		mylist.clear();
	}
}
