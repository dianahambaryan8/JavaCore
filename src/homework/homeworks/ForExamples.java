package homework.homeworks;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print(" - ");
            }
        }
        System.out.println("\n");

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int x = array[0];   // x = max
        for (int i = 1; i < array.length; i++) {
            if (array[i] > x) {
                x = array[i];
            }
        }
        System.out.println("max is = " + x);
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println();


    }
}
