package ctci.strings;

public class OneAway {

	public static boolean oneAway(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) > 1) return false;
		boolean flag = false;
		int index1 = 0;
		int index2 = 0;
		while(index1 < s1.length() && index2 < s2.length()) {
			if(s1.charAt(index1) == s2.charAt(index2)) {
				index1++;
				index2++;
			} else {
				if(flag) return false;
				flag = true;
				if(s1.length() > s2.length()) {
					index2++;
				} else if (s1.length() < s2.length()) {
					index1++;
				} else {
					index1++;
					index2++;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(oneAway("pas", "bales"));
	}
	
}
