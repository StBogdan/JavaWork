package LeetCode;


class Trie {
    Node root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new Node(' ');
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Node currentNode = this.root;
        int word_index = 0;
        while (word_index < word.length() && currentNode.children.containsKey(word.charAt(word_index))) {
            currentNode = currentNode.children.get(word.charAt(word_index));
            word_index += 1;
        }

        while (word_index < word.length()){
            // Create new node, add it to the current, iterate until we run out of letters
            var addedNode = new Node(word.charAt(word_index));
            currentNode.add_child(addedNode);

            currentNode = addedNode;
            word_index +=1;
        }
        // Mark that the word ends there
        currentNode.setWordEnd(true);
    }

    public boolean search(String word){
        return this.search(word, true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word, boolean wholeWord) {
        Node currentNode = this.root;
        int word_index = 0;
        while (word_index < word.length() && currentNode.children.containsKey(word.charAt(word_index))) {
            currentNode = currentNode.children.get(word.charAt(word_index));
            word_index += 1;
        }
        System.out.println("Looking for " + word + " found: " +  (word_index == word.length()) + " whole word: " +  currentNode.isWordEnd());

        return word_index == word.length() && (!wholeWord || currentNode.isWordEnd());
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return this.search(prefix, false);
    }
}