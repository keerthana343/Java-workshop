class TrieNode1 {
    TrieNode1[] children;
    boolean isEndOfWord;

    public TrieNode1() {
        children = new TrieNode1[26];
        isEndOfWord = false;
    }
}

class Trie {
    TrieNode1 root;

    public Trie() {
        root = new TrieNode1();
    }

    public void insert(String word) {
        TrieNode1 currentNode = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode1();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode1 currentNode = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode.isEndOfWord;
    }

    public boolean isPrefix(String prefix) {
        TrieNode1 currentNode = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] words = {"apple", "app", "banana", "bat", "ball"};
        for (String word : words) {
            trie.insert(word);
        }
        String searchWord = "app";
        if (trie.search(searchWord)) {
            System.out.println(searchWord + " found in trie.");
        } else {
            System.out.println(searchWord + " not found in trie.");
        }
        System.out.println();
        String[] prefixKeys = {"ge", "ba", "do", "de"};
        for (String s : prefixKeys) {
            if (trie.isPrefix(s)) {
                System.out.println(s + " is present as a prefix in trie.");
            }
        }
    }
}