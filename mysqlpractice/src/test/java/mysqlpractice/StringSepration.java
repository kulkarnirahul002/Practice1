package mysqlpractice;

import java.util.Iterator;

import org.testng.annotations.Test;

public class StringSepration {

	@Test
	public void StringBifurcate() {
		
		String str="Dee1pa2k$@";
		String number="";
		String special="";
		String alpha="";
		
		str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				number=number+c;
			}
			else if(Character.isLetter(c))
			{
				alpha=alpha+c;
			}
			else
			{
				special=special+c;
			}
		}
		
		String s="0123456789";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			int j=(int)c;
			System.out.println(j);
			
		}
		System.out.println("Alphabets:"+alpha);
		System.out.println("Number:"+number);
		System.out.println("Special characters:"+special);
		
		
		//range 65-91 :capital alphabets
		//range 97-122 :Lower alphabets
		//number 48-57 :numbers
	}
}
