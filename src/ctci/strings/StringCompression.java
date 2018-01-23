package ctci.strings;

public class StringCompression {
	public static String compress(String s) {
		StringBuilder sb = new StringBuilder("");
		int index = 0;
		while(index < s.length()) {
			int count = 1;
			while(index+1 != s.length() && s.charAt(index) == s.charAt(index+1)) {
				count++;
				index++;
			}
			sb.append(s.charAt(index));
			sb.append(count);
			index++;
		}
		if(sb.length() < s.length())
			return sb.toString();
		else return s;
	}
	
	public static void main(String[] args) {
		System.out.println(compress("abcdefghij"));
	}
}
