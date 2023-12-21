package org.example;

public class Yams {
    public static int score(int[] des) {
        int score = 0;
        for (int i = 0; i < des.length; i++) {
            if (des[i] == 1) {
                score += 1;
            }
        }

        if (score == 3) {
            score = 28;
        } else if (score == 4) {
            score = 35;
        }

        return score;
    }
}
