package ctci.strings;

public class URLify {

	public static String urlify(String s, int n) {
		char[] arr = s.toCharArray();
		int i = n-1;
		for(int j = s.length() - 1; j >= 0 && i >= 0; j--, i--) {
			if(arr[i] != ' ') {
				swap(arr, i, j);
			} else {
				arr[j--] = '0';
				arr[j--] = '2';
				arr[j] = '%';
			}
		}
		return new String(arr);
	}
	
	public static char[] swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		System.out.println(urlify(s, 13));
	}
	
}
