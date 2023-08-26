package classwork.chapter2;

public class Example2 {
    public static void main(String[] args) {
        int num;
        num = 10;
        System.out.println("num is 10 " + num);
        System.out.println("num is 1010 " + num + num);
        System.out.println("num is 20 " + (num + num));
        num = num * 5;
        System.out.println("num is 50 " + num);
        System.out.println("num is 501 " + num + 1);
        System.out.println("num is 51 " + (num + 1));
        System.out.println("num is 48 " + (num - 2));
        System.out.println("num is 2500 " + (num * num));
        System.out.println("num is 2500 " + num * num);
        System.out.println("num is 100 " + num * 2);
        System.out.println("num is 25 " + num / 2);

        int x = 0b1010; //binary literals
        System.out.println(x);
        int y = 123_4546_789;
        System.out.println(y);

    }
}
