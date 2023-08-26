package homework.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("X is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("Now x is equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("X is greater than y");
        }
        if (x == y) {
            System.out.println("You won't see this.");
        }
        if (x > y) {
            int z = x + y + 10;
            System.out.println(z);
        }
    }
}
