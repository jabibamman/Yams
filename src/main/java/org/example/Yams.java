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

        if (brelan && paire) {
            score = 30;
        } else if (brelan) {
            score = 28;
        } else if (paire) {
            score = 0;
        } else if (carre) {
            score = 35;
        } else if (yams) {
            score = 50;
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

        return score;
    }
}
