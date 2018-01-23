import java.util.List;


public class WordBreak {
	 public boolean wordBreakRec(String s, List<String> wordDict) {
	        if(wordDict.contains(s)) return true;
	        boolean result = false;
	        for(int i = 0; i < s.length(); i++) {
	            if(wordDict.contains(s.substring(0, i))) {
	                result = wordBreakRec(s.substring(i), wordDict);
	                if(result) return true;
	            }
	        }
	        return result;
	    }
	 
	 public boolean wordBreakDP(String s, List<String> wordDict) {
	        int len = s.length();
	        boolean[] a = new boolean[len+1];
	        a[0] = true;
	        for(int i = 1; i <= len; i++) {
	            for(int j = 0; j < i; j++) {
	                if(a[j] && wordDict.contains(s.substring(j, i))) {
	                    a[i] = true;
	                    break;
	                }
	            }
	        }
	        return a[len];
	    }
}
