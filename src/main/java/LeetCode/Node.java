package LeetCode;

import java.util.HashMap;

class Node{
    char value;

    boolean wordEnd = false;

    HashMap<Character, Node> children;
    public Node(char value) {
        this.value = value;
        children = new HashMap<>();
    }

    public void add_child(Node child){
        this.children.put(child.value, child);
    }

    public boolean isWordEnd() {
        return this.wordEnd;
    }

    public void setWordEnd(boolean wordEnd) {
        this.wordEnd = wordEnd;

    }
}
