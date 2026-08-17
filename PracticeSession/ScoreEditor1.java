import java.util.Scanner;

class ScoreEditor {
    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores:");
        for (int index = 0; index < scores.length; index++) {
            System.out.print(" " + scores[index]);
        }
        System.out.println();
    }
}

public class ScoreEditor1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        ScoreEditor editor = new ScoreEditor();
        editor.correctScore(scores, correctionIndex, newScore);
        editor.displayScores(scores);
    }
}