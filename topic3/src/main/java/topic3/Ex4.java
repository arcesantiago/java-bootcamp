package topic3;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {
	private Map<Integer, String> romanNumbers;
	// constructor sets list of numbers and roman numbers
	public Ex4() {
		romanNumbers = new HashMap<Integer, String>();
		romanNumbers.put(1, "I");
		romanNumbers.put(2, "II");
		romanNumbers.put(3, "II");
		romanNumbers.put(4, "IV");
		romanNumbers.put(5, "V");
		romanNumbers.put(6, "VI");
		romanNumbers.put(7, "VII");
		romanNumbers.put(8, "IIX");
		romanNumbers.put(9, "IX");
		romanNumbers.put(10, "X");
		romanNumbers.put(20, "XX");
		romanNumbers.put(30, "XXX");
		romanNumbers.put(40, "XL");
		romanNumbers.put(50, "L");
		romanNumbers.put(60, "LX");
		romanNumbers.put(70, "LXX");
		romanNumbers.put(80, "XXL");
		romanNumbers.put(90, "XC");
		romanNumbers.put(100, "C");
		romanNumbers.put(200, "CC");
		romanNumbers.put(300, "CCC");
		romanNumbers.put(400, "CD");
		romanNumbers.put(500, "D");
		romanNumbers.put(600, "DC");
		romanNumbers.put(700, "DCC");
		romanNumbers.put(800, "DCCC");
		romanNumbers.put(900, "CM");
	}
	//this method convert int to roman number
	public String converterToRoman(int number){
		String roman;
		if(number>=100){
			roman = romanNumbers.get((number/100)*100)
						 +romanNumbers.get(((number/10)%10)*10)
						 +romanNumbers.get(number%10);
		}
		else if(number>=10){
			roman =	romanNumbers.get(((number/10)%10)*10)
					+romanNumbers.get(number%10);
		}
		else roman = romanNumbers.get(number%10);
		return roman;
	}
	//this method convert roman number to int
	public Integer converterToInt(String roman){
		Integer n = null;
		for(Integer key: romanNumbers.keySet()){
			if(romanNumbers.get(key) == roman) n = key;
		}
		return n;
	}
	
	
}
