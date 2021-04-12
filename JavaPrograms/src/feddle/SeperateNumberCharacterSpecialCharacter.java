package feddle;

public class SeperateNumberCharacterSpecialCharacter {

	public static void main(String[] args) 
	{
		String string ="123*#*#$shbhdshh";
		char[] character = string.toCharArray();

		for(char chara:character)
		{
			if(chara>47&&chara<58)
			{
				System.out.print(chara);
			}
			else if(chara>96&&chara<=122)
			{
				System.out.print(chara);
			} else {
				System.out.print(chara);
			}
		}
	}

}
