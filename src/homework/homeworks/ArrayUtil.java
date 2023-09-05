package homework.homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int max = array[0];
        int first = array[0];
        int min = array[0];
        int sum = 0;
        int even = 0;
        int odd = 0;
        int x = 0;

        if (array.length > 2) {
            if (array.length % 2 != 0) {
                //  System.out.println("odd");
                x = array.length / 2;
                //  System.out.println(array[x]);
            } else {
                System.out.println("even");
            }
        } else {
            System.out.println("can't print middle values");
        }
        System.out.print("1) ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum = sum + array[i];
            if (array[i] % 2 == 0) {
                even = even + 1;
            }
            if (array[i] % 2 != 0) {
                odd = +1;
            }
        }
        System.out.println();
        System.out.println("2) The first element is " + first);
        System.out.println("3) The last element is " + array[8]);
        System.out.println("4) Array length is " + (array.length - 1));
        // System.out.println(" max is " + max);
        System.out.println("5) min is " + min);
        System.out.println("6) middle element is " + array[x]);
        System.out.println("7) even is " + even);
        System.out.println("8) odd is " + odd);
        System.out.println("9) sum is " + sum);
        System.out.println("10) average is " + sum / array.length);


    }
}
