class WordDictionary {

	class TrieNode {
		TrieNode[] children;
		boolean isEndOfWord;
		
		public TrieNode() {
			children = new TrieNode[26];
			for(int i = 0; i < 26; i++) {
				children[i] = null;
			}
			isEndOfWord = false;
		}
		
	}
	
	TrieNode root;
	
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        char[] arr = word.toCharArray();
        TrieNode temp = root;
        for(int i = 0; i < arr.length; i++) {
        	int pos = arr[i] - 'a';
        	if(temp.children[pos] == null) {
        		temp.children[pos] = new TrieNode();
        	}
        	temp = temp.children[pos];
        }
        temp.isEndOfWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
    	return search(root, word);
    }
    
    public boolean search(TrieNode node, String word) {
    	if(node == null) return false;
		if(word.length() == 0 && node.isEndOfWord) return true;
    	char first = word.toCharArray()[0];
    	if(first == '.') {
    		for(TrieNode n : node.children) {
    			if(n != null) {
    				if (search(n, word.substring(1))) return true;
    			}
    		}
    	} else {
        	int pos = first - 'a';
			return search(node.children[pos], word.substring(1));
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	WordDictionary obj = new WordDictionary();
    	obj.addWord("bad");
    	obj.addWord("dad");
    	obj.addWord("mad");
    	System.out.println(obj.search("pad"));
    	System.out.println(obj.search("bad"));
    	System.out.println(obj.search(".ad"));
    	System.out.println(obj.search("b.."));
	}
}