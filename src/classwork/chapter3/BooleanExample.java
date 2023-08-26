package classwork.chapter3;

public class BooleanExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        boolean c = a < b, z = a > b;
        System.out.println(c);  //true
        System.out.println(z);  //false
        if (c) {
            System.out.println("c is true");
        }
    }
}
