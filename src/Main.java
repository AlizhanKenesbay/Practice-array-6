import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if(array[i] <= array[i-1]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Массив является возрастающей последовательно");
        } else {
            System.out.println("Массив не является возрастающим последовательно");
        }
    }
}