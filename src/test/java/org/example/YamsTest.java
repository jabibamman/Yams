package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YamsTest {
     // Brelan
     @Test
     public void throw_should_return_28_when_1_1_1_2_3() {
         Dice dice = new Dice(new int[]{1, 1, 1, 2, 3});
         int score = Yams.score(dice);
         assertEquals(28, score);
     }

     // Carré
    @Test
    public void throw_should_return_35_when_1_1_1_1_3() {
        Dice des = new Dice(new int[]{1, 1, 1, 1, 3});
        int score = Yams.score(des);
        assertEquals(35, score);
    }

    // Full
    @Test
    public void throw_should_return_30_when_1_1_1_2_2() {
        Dice dice = new Dice(new int[]{1, 1, 1, 2, 2});
        int score = Yams.score(dice);
        assertEquals(30, score);
    }

    // Grande suite
    @Test
    public void throw_should_return_40_when_1_2_3_4_5() {
        Dice dice = new Dice(new int[]{1, 2, 3, 4, 5});
        int score = Yams.score(dice);
        assertEquals(40, score);
    }

    @Test
    public void throw_should_return_40_when_2_3_4_5_6() {
        Dice dice = new Dice(new int[] {2, 3, 4, 5, 6});
        int score = Yams.score(dice);
        assertEquals(40, score);
    }

    // Yams
    @Test
    public void throw_should_return_50_when_1_1_1_1_1() {
        Dice dice = new Dice(new int[]{1, 1, 1, 1, 1});
        int score = Yams.score(dice);
        assertEquals(50, score);
    }

    @Test
    public void throw_should_return_50_when_2_2_2_2_2() {
        Dice dice = new Dice(new int[]{2, 2, 2, 2, 2});
        int score = Yams.score(dice);
        assertEquals(50, score);
    }

    // Chance
    @Test
    public void throw_should_return_16_when_1_2_3_4_6() {
        Dice dice = new Dice(new int[]{1, 2, 3, 4, 6});
        int score = Yams.score(dice);
        assertEquals(16, score);
    }

    @Test
    public void throw_should_return_sum_of_dice_for_no_specific_figure() {
        Dice dice = new Dice(new int[]{2, 3, 5, 6, 1});
        int score = Yams.score(dice);
        assertEquals(17, score);
    }
}
