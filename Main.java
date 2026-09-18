

import java.util.*;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String s = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();
			
			if (isSubSequenceOfS(s, word)) count++;
		}
		
		
		System.out.println(count);
	}
	
	public static boolean isSubSequenceOfS(String s, String word) {
		
		if (word.length() > s.length()) return false;
		
		int index = -1;
		
		for (int i = 0; i < word.length(); i++) {
			index = s.indexOf(word.charAt(i), index +1);
			if (index == -1) {
				return false;
			}
		}
		
		return true;
	}
	
}
