package org.example;

public class Yams {
    public static int score(int[] des) {
        int score = 0;
        int[] counts = new int[6]; 
        for (int die : des) {
            counts[die - 1]++;
        }

        boolean brelan = false;
        boolean paire = false;
        boolean carre = false;
        boolean yams = false;

        for (int count : counts) {
            if (count == 5) {
                return Figure.YAMS.getPoints();
            }
        }


        for (int faceIndex = 0; faceIndex < counts.length; faceIndex++) {
            if (counts[faceIndex] == 3) {
                brelan = true;
            } else if (counts[faceIndex] == 2) {
                paire = true;
            } else if (counts[faceIndex] == 4) {
                carre = true;
            } else if (counts[faceIndex] == 5) {
                yams = true;
            }
        }

        if (carre) {
            score = Figure.CARRE.getPoints();
        } else if (brelan && paire) {
            score = Figure.FULL.getPoints();
        } else if (brelan) {
            score = Figure.BRELAN.getPoints();
        }

        boolean isSuiteFromOneToFive = true;
        boolean isSuiteFromTwoToSix = true;
        for (int faceIndex = 0; faceIndex < 5; faceIndex++) {
            if (counts[faceIndex] != 1) isSuiteFromOneToFive = false;
            if (counts[faceIndex + 1] != 1) isSuiteFromTwoToSix = false;
        }

        if (isSuiteFromOneToFive || isSuiteFromTwoToSix) {
            score = 40;
        }

        if (score == 0) {
            for (int die : des) {
                score += die;
            }
        }
        
        return score;
    }
}
