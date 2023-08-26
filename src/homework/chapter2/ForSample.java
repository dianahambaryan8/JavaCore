package homework.chapter2;

public class ForSample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is i " + (i + 1));

        }
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
        for (int j = 20; j<321; j = j + 50) {
            System.out.print(j + " ");

        }
    }
}
