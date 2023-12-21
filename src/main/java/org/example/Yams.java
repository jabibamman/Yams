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

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 3) {
                brelan = true;
            } else if (counts[i] == 2) {
                paire = true;
            } else if (counts[i] == 4) {
                carre = true;
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
        }

        return score;
    }
}
