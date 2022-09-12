import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPractise {
	
	public static String sort(String str) {
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static boolean isPanagram(String str) {
		boolean[] alpha = new boolean[26];
		
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			int index = str.charAt(i) - 'a';
			alpha[index] = true;
		}
		
		for(int i=0; i<26; i++) {
			if(!alpha[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Reverse a String");
		String s1 = "hello";
		
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		
		System.out.println(s2);
		
		System.out.println("Reverse a sentence");
		
		String s3 ="Think Twice";
		String s4 = "";
		
		String[] splits3 = s3.split(" ");
		
		for(int i=splits3.length-1; i>=0; i--) {
			s4 = s4 + splits3[i] + " ";
		}
		
		System.out.println(s4);
		
		System.out.println("Anagram");
		
		String s5 = "ana";
		String s6 = "naa";
		
		String sorteds5 = sort(s5);
		String sorteds6 = sort(s6);
		
		if(sorteds5.equals(sorteds6)) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not an anagram");
		}
		
		System.out.println("Panagram");
		
		String s7 = "Abcdefghijklmnopqrstuvwxy";
		
		if(isPanagram(s7)) {
			System.out.println("It is Panagram");
		}else {
			System.out.println("It is not an Panagram");
		}
		
		System.out.println("WAP to print repeatedly occurring characters in the given String.");
		
		String s8 = "aaaabbbcccd";
		
		Set<Character> hash_Set = new HashSet<Character>();
		
		for(int i=0; i<s8.length(); i++) {
			hash_Set.add(s8.charAt(i));
		}
		
		System.out.println(hash_Set);
		
		System.out.println("WAP to sort a String Alphabetically.");
		
		String s9 = "dabc";
		
		System.out.println(sort(s9));
		
		System.out.println("WAP to count the number of Vowels and Consonants of a String value.");
		
		Set<Character> hash_Set2 = new HashSet<Character>(Arrays.asList(new Character[]{'a','e', 'i', 'o', 'u'}));
		
		int countVowels = 0;
		int countConsonants = 0;
		
		String s10 = "hello world";
		
		for(int i=0; i<s10.length(); i++) {
			char c = s10.charAt(i);
			
			if(hash_Set2.contains(c)) {
				countVowels++;
			}else if(c >= 'a' && c<='z') {
				countConsonants++;
			}
		}
		
		System.out.println("Count of vowels: "+ countVowels + " , and Consonats: " + countConsonants);
		
		System.out.println("WAP to count number of special characters.");
		
		int count =0;
		
		for(int i=0; i<s10.length(); i++) {
			char c = s10.charAt(i);
			
			if(c>='a' && c<='z' || c>= 'A' && c<= 'Z' || c >= '0' && c <= '9') {
				continue;
			}else {
				count++;
			}
		}
		
		System.out.println("count of special characters: "+ count);
		
	}

}
