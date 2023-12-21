package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YamsTest {
     // Brelan
     @Test
     public void should_return_28_when_1_1_1_2_3() {
         int[] des = {1, 1, 1, 2, 3};
         int score = Yams.score(des);
         assertEquals(28, score);
     }

     // Carré
    @Test
    public void should_return_35_when_1_1_1_1_3() {
        int[] des = {1, 1, 1, 1, 3};
        int score = Yams.score(des);
        assertEquals(35, score);
    }

    // Full
    @Test
    public void should_return_30_when_1_1_1_2_2() {
        int[] des = {1, 2, 1, 1, 2};
        int score = Yams.score(des);
        assertEquals(30, score);
    }

    // Grande suite
    @Test
    public void should_return_40_when_1_2_3_4_5() {
        int[] des = {1, 2, 3, 4, 5};
        int score = Yams.score(des);
        assertEquals(40, score);
    }

    @Test
    public void should_return_40_when_2_3_4_5_6() {
        int[] des = {2, 3, 4, 5, 6};
        int score = Yams.score(des);
        assertEquals(40, score);
    }

    // Yams
    @Test
    public void should_return_50_when_1_1_1_1_1() {
        int[] des = {1, 1, 1, 1, 1};
        int score = Yams.score(des);
        assertEquals(50, score);
    }

    @Test
    public void should_return_50_when_2_2_2_2_2() {
        int[] des = {2, 2, 2, 2, 2};
        int score = Yams.score(des);
        assertEquals(50, score);
    }
}
