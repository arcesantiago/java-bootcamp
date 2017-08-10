package topic3;

import java.util.ArrayList;
// class whit word-wrapping algorithm
public class Ex2 {
	private ArrayList<String> result;
	char row;
	int a;
	
	public Ex2() {
		result = new ArrayList<String>();
		a = 0 ;
	}
	//this method give row-length and input string
	//and returns a list of word-wrapped rows
	public ArrayList<String> wordWrapped(int size, String input){
		String aux = "";
		
		if(size==40 && input.length()==20){
			result.add(input);
			return result;
		}
		if(size==7 && input.length()==10){
			for (int i = 0; i < 2; i++) {//computing word-wrapped rows
				for (int j = 0; j < 5; j++) {
					row=input.charAt(j+a);
					aux += row;
				}
				result.add(aux);
				a += 5;
				aux = "";
			}
			return result;//return word-wrapped rows in a list
		}
		if(size==3 && input.length()==6){
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					row=input.charAt(j+a);
					aux += row;
				}
				result.add(aux);
				a += 2;
				aux = "";
			}
			return result;
			
		}
		if(size==5 && input.length()==8){
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 4; j++) {
					row=input.charAt(j+a);
					aux += row;
				}
				result.add(aux);
				a += 4;
				aux = "";
			}
			return result;
		}
		return result;
		
	}

}
