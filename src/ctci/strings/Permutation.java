package ctci.strings;

import java.util.Arrays;

public class Permutation {
	
	public static boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i < s1.length(); i++) {
			if(arr1[i] != arr2[i]) return false;
		}
		return true;
	}
	
	public static boolean isPermutation2(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		int[] arr = new int[26];
		for(int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i) - 'a'] ++;
			arr[s2.charAt(i) - 'a'] --;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "qwertyuiop";
		String s2 = "poiuytrewq";
		System.out.println(isPermutation(s1, s2));
		System.out.println(isPermutation2(s1, s2));
	}
	
}
