package main.java.siva;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> words=new ArrayList<String>();
	    
	    words.add("Rat");
	    words.add("Car");
	    words.add("Below");
	    words.add("Tast");
	    words.add("Cried");
	    words.add("Study");
	    words.add("Thing");
	    words.add("Chin");
	    words.add("Grab");
	    words.add("Act");
	    words.add("Robed");
	    words.add("Vase");
	    words.add("Glean");
	    words.add("Desserts");
	    words.add("Tar");
	    words.add("Arc");
	    words.add("Elbow");
	    words.add("State");
	    words.add("Cider");
	    words.add("Dusty");
	    words.add("Night");
	    words.add("Inch");
	    words.add("Brag");
	    words.add("Cat");
	    words.add("Bored");
	    words.add("Save");
	    words.add("Angel");
	    words.add("Streseed");
	    
	    
	}
	
	public static List<ArrayList<String>> returnAnagrams(List<String> wordsList) {
		List<ArrayList<String>> resultLists = new ArrayList<ArrayList<String>>();
		List<String> list = new ArrayList<String>();
		for (int p=0; p<wordsList.size();p++) {
			for (int q=p+1; q<wordsList.size();q++) {
				checkIfAnagram(wor, s2)
			
		}
		
		
		return resultLists;
		
	}
	
	public static boolean checkIfAnagram(String s1, String s2) {
//		for (int i = 0;i<s1.length();i++) {
		Set charSet = new TreeSet<char[]>();
		Set charSet1 = new TreeSet<char[]>();
		for (char c:s1.toCharArray()) {
			charSet.add(c);
		}
		
		for (char c:s2.toCharArray()) {
			charSet1.add(c);
		}
		return charSet.equals(charSet1);
	}
}