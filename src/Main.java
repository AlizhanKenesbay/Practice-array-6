import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        int checkIndex = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > checkIndex) {
                System.out.println("Массив возрастающий");
            } else {
                System.out.println("Массив не возрастающий");
            }
        }
    }
}