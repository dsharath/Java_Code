package merge.strings;

import java.util.Scanner;

public class MergeMain extends MergeMethod{

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

	    System.out.print("String 1 : ");
	    String s1 = scanner.nextLine();

	    System.out.print("String 2 : ");
	    String s2 = scanner.nextLine();
	    /*
	    MergeMethod ob = new MergeMethod();*/
	    

	    System.out.println("Combined string is : " + MergeMethod.merge(s1,s2));
	}

	

}



