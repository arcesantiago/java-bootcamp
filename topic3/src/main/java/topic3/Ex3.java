package topic3;

import java.util.LinkedHashSet;
//this class computing the recent list
public class Ex3{
	private LinkedHashSet<String> list;
	private String last;
	
	public Ex3() {
		list = new LinkedHashSet<String>();
		last = null;
	}
	//this method open and add file to recent list
	public void open(String s){
		if(list.size() == 3) {
			for(String e : list) last = e;
			list.remove(last);
			list.add(s);
		}
		else if(list.add(s));
		else {
			list.remove(s);
			list.add(s);
		}
	}
	//get last file
	public String getLast() {
	    String last = null;
	    for(String e : list) last = e;
	    return last;
	}
	//to string
	public String toString(){
		return list.toString();
	}
	//this class return true if list is empty
	public boolean isEmpty(){
		return list.isEmpty();
	}
	// get size list
	public int size(){
		return list.size();
	}

}
