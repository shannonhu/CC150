package Chapter1;

//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure
public class onePointOne_UniqueChar {
	public static boolean uniqueChar1(String str)
	{
		if(str.length() > 256)
			return false;
		
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length(); i++)
		{
			//return the ASCII code of each character
			int val = str.charAt(i);

			if(char_set[val])
			{
				return false;
			}
			else
			{
				char_set[val] = true;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String[] words = {"abcded", "kite", "hello", "padleboarding"};
		for (String word : words)
		{
			System.out.println(word + ":" + uniqueChar1(word));
		}
	}

}
