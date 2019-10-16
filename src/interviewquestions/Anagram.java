package interviewquestions;

import java.util.Arrays;

public class Anagram {

	
	
	public static void isanagram(String st1, String st2) {
		
		
		String s1 = st1.replaceAll("\\s","");
		String s2= st2.replaceAll("\\s", "");
		boolean status= true;
		if(s1.length()!=s2.length()) {
			status = false;
		}else {
			char[] arrays1= s1.toLowerCase().toCharArray();
			char[] arrays2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			status=Arrays.equals(arrays1,arrays2);
			
		}if(status) {
			System.out.println(s1+""
					+ " and " + s2 +" are anagrams");
		}else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
	
	public static void main(String[] args) {
		
		isanagram("keep", "peek");
		isanagram("MotherInLaw", "HitlerWoman");
		
	}
	
}
