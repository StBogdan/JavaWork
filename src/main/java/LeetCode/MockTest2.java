package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class MockTest2 {

    public static void main(String[] args) {
        /**
         *
         * Your Trie object will be instantiated and called as such:
         */

        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println("True ? " + trie.search("apple"));   // returns true
        System.out.println("False ? " + trie.search("app"));     // returns false
        System.out.println("True ? " + trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println("True ? " + trie.search("app"));     // returns true
        System.out.println("test");
    }

    List<List<Integer>> curLists= new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        // God I hate Java
        var initList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        this.rec_build(initList, new ArrayList<Integer>());
        return this.curLists;
    }

    void rec_build(List<Integer> availableNums, List<Integer> curList){
        if(availableNums.size() == 1){
            curList.add(availableNums.get(0));
            curLists.add(new ArrayList<Integer>(curList));
        }
        else{
            for(int i=0; i< availableNums.size(); i++){
                int elem = availableNums.get(i);
                curList.add(elem);

                // Remove and recurse with new array
                var newNums = new ArrayList<Integer>(availableNums);
                newNums.remove(i);
                rec_build(newNums, new ArrayList<>(curList));

                curList.remove(curList.size() -1);
            }
        }
    }

}
