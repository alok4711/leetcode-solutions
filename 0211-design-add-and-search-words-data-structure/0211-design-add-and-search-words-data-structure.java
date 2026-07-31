class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean isEnd = false;
}
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }public void addWord(String word) {

        TrieNode curr = root;

        for (char c : word.toCharArray()) {

            int idx = c - 'a';

            if (curr.child[idx] == null)
                curr.child[idx] = new TrieNode();

            curr = curr.child[idx];
        }

        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }
    
    boolean dfs(String word, int i, TrieNode node) {

        if (node == null)
            return false;

        if (i == word.length())
            return node.isEnd;

        char c = word.charAt(i);

        if (c == '.') {

            for (TrieNode next : node.child) {
                if (next != null && dfs(word, i + 1, next))
                    return true;
            }

            return false;
        }

        return dfs(word, i + 1, node.child[c - 'a']);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */