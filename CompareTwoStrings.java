package week3day1;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "I am Learning Java";
		String s2= "I am learning java?"; 
		
		if (s1==s2)
		{
		System.out.println("Given Statement is Correct");
		}
		else
			System.out.println("Given Statement is Incorrect");
		
		System.out.println("*********");

		System.out.println("EQUALS:"); 
		
		System.out.println(s1.equals(s2));
		
		System.out.println("**********");
		
		System.out.println("EQUALS IGNORE CASE:");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
		
		System.out.println("*********");
		
		
		//equals ignore case
		
		boolean result= s2.equalsIgnoreCase(s1);
		System.out.println("s2 is equal to s1:"  +result);
	}

}
