package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YamsTest {
     @Test
        public void should_return_28_when_1_1_1_2_3() {
            int[] des = {1, 1, 1, 2, 3};
            int score = Yams.score(des);
            assertEquals(28, score);
        }

}
