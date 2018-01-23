package ctci.strings;

import java.util.Arrays;

public class Unique {

	public static void main(String[] args) {
		String s = "abcdefghia";
		System.out.println(isUnique(s));
		System.out.println(isUnique2(s));
	}
	
	public static boolean isUnique2(String s) {
		boolean[] arr = new boolean[26];
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i) - 'a']) return false;
			arr[s.charAt(i) - 'a'] = true;
		}
		return true;
	}
	
	public static boolean isUnique(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) return false;
		}
		return true;
	}
}
