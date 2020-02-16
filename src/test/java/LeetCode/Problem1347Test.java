package LeetCode;

import static org.junit.jupiter.api.Assertions.*;

class Problem1347Test {


    @org.junit.jupiter.api.Test
    public void basicTest1() {
        var prob = new Problem1347();
        String s = "bab";
        String t = "aba";
        assertEquals(1, prob.minSteps(s, t));
    }

    @org.junit.jupiter.api.Test
    public void basicTest2() {
        var prob = new Problem1347();
        String s = "bab";
        String t = "aba";
        assertEquals(1, prob.minSteps(s, t) );
    }

    @org.junit.jupiter.api.Test
    public void basicTest3() {
        var prob = new Problem1347();
        String s = "anagram";
        String t = "mangaar";
        assertEquals(0, prob.minSteps(s, t));
    }

    @org.junit.jupiter.api.Test
    public void basicTest4() {
        var prob = new Problem1347();
        String s = "xxyyzz";
        String t = "xxyyzz";
        assertEquals(0, prob.minSteps(s, t));
    }

    @org.junit.jupiter.api.Test
    public void basicTest5() {
        var prob = new Problem1347();
        String s = "friend";
        String t = "family";
        assertEquals(4 , prob.minSteps(s, t));
    }

}