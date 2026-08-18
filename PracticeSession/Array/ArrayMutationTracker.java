package Array;

public class ArrayMutationTracker {
    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        int[] snapshot = new int[readings.length];

        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        readings[updateIndex] = newValue;

        System.out.print("Snapshot:");
        for (int val : snapshot) {
            System.out.print(" " + val);
        }
        System.out.println();

        System.out.print("Updated:");
        for (int val : readings) {
            System.out.print(" " + val);
        }
        System.out.println();
    }
}

