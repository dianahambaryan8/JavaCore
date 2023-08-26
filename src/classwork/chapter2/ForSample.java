package classwork.chapter2;

public class ForSample {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 100; i++) {
            System.out.println((i + 1) + " Poxos");
            if (i == 50) {
                System.out.println(i + " Petros");
            }
        }
        System.out.println(i); // 100
        System.out.println("Petros");


        for (int j = 20; j >= 10; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int x = 0; x < 20; x++) {
            System.out.print((x + 1) + " ");
        }

    }
}

