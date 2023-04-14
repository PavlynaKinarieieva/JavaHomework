import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // Заполняем массив произвольными значениями
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите \"true\", чтобы отсортировать по возрастанию, или \"false\", чтобы отсортировать по убыванию: ");
        boolean ascending = scanner.nextBoolean();
        scanner.close();

        // Вызываем метод сортировки и выводим отсортированный массив
        sortArray(arr, ascending);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Метод для сортировки массива
    public static void sortArray(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ascending) {
                    // Сортировка по возрастанию
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                } else {
                    // Сортировка по убыванию
                    if (arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }
}