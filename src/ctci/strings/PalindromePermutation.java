package ctci.strings;

public class PalindromePermutation {
	
	public static boolean checkPalinPerm(String s) {
		int[] freq = new int[26];
		s = s.replace(" ", "");
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		boolean flag = false;
		for(int i = 0; i < 26; i++) {
			if(freq[i]!=0 && i%2 != 0) {
				if(flag) return false;
				flag = true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "Tact Coadafsd";
		System.out.println(checkPalinPerm(s));
	}
	
}
