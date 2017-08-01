package jar;

import java.util.Scanner;

public class App {
	public static void main( String[] args ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a name: ");
    	String name = scanner.next();
    	
    	if(name.equals("santiago")){
    		System.out.println("Hello santiago");
    	}
    	else System.out.println("Error");
    }
}
