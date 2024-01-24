import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", getMonthSum(arr));
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", min(arr));
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", max(arr));
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", getAverageSum(arr));
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseArray(reverseFullName);
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_001) + 100_000;
        }
        return arr;
    }

    public static int getMonthSum(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }

    public static int max(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }

    public static int min(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .getAsInt();
    }

    public static double getAverageSum(int[] arr) {
        return (double) getMonthSum(arr) / arr.length;
    }

    public static void reverseArray(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}