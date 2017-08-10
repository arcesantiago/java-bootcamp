package topic3;

public class Ex1 {
	
	private String [] units = {"","one", "two","three","four","five"
								,"six","seven","eight", "nine"};
	private String [] ten = {"","ten","twenty","thirty","forty","fify","sixty","seventy","eighty"
							,"ninety"};
	//this method convert amount to appropriate text
	public String convertToString(int n){
		String number = null;
		if(n>=1000){ number = units[n/1000]+" thousand" +" "+ units[n/100-((n/1000)*10)]+" hundred"
							+" "+ ten[n/10-((n/100)*10)] +" "+ units[n/1-((n/10)*10)];
		return number;}
	if(n>=100){ number = units[n/100-((n/1000)*10)]+" hundred"
			+" "+ ten[n/10-((n/100)*10)] +" "+ units[n/1-((n/10)*10)];
		return number;
	}
	if(n>=10){ number = ten[n/10-((n/100)*10)] +" "+ units[n/1-((n/10)*10)];
		return number;
	}
	if(n<=9){ number = units[n/1-((n/10)*10)];
		return number;
	}
	else return "incorrect number";
 }
}

