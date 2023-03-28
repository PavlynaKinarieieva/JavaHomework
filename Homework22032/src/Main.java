import java.util.Scanner;

class CheckOddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b;

        boolean isOdd = sum % 2 != 0;

        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
        System.out.println("Сумма " + (isOdd ? "нечетная" : "четная"));
    }
}
