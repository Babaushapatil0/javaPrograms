package assignmentD17;

public class ToUpperCase {

	public static void main(String[] args) 
	
	{
		firstletteruppercase("om namah shivaya");
		firstletteruppercase("jai hanuman");
		firstletteruppercase("jai ganapati");
		firstletteruppercase("jai royal challengers bengaluru");
		
	}
	
	public static void firstletteruppercase(String s)
	{
		String[] s1 = s.split(" ");
		
		for (String string : s1) 
		{
		
		// each word will come one by one
	
		String trim = string.substring(1);  // it will remove first letter in each word
		
		String upper = string.toUpperCase(); // it will convert whole word into uppercase
		
		char char1 = upper.charAt(0); // extract first letter of word
		
		System.out.print(char1+""+trim+" "); // concat first letter with trimmed word
		
		}
		
		
	}

}
