import java.util.Arrays;
import java.util.Random;

public class ReplaceAndSort {

    public static void main(String[] args) {

        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        Arrays.sort(array);


        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
