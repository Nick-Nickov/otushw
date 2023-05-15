import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println("Массив: " + Arrays.toString(arr));

        long startTimePrimitives = System.currentTimeMillis();
        Sort(arr);
        long endTimePrimitives = System.currentTimeMillis();

        System.out.println("Сортировка пузырьком: " + Arrays.toString(arr));
        System.out.println("Время: " + (endTimePrimitives - startTimePrimitives) + " ms");

        // Сортировка Collections.sort()
        long startTimeCollections = System.currentTimeMillis();
        Collections.sort(list);
        long endTimeCollections = System.currentTimeMillis();

        System.out.println("Сортировка Collections.sort(): " + list);
        System.out.println("Время: " + (endTimeCollections - startTimeCollections) + " ms");

    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}