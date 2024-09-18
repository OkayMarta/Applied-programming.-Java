import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Клас для вирішення завдання з числами Фібоначчі, що закінчуються на певну цифру.
 * <p>
 * Генерує перші N чисел Фібоначчі і знаходить числа, які закінчуються на задану цифру.
 */
public class FibonacciTask {

    /**
     * Генерує список перших N чисел Фібоначчі.
     *
     * @param N Кількість чисел Фібоначчі для генерації.
     * @return Список об'єктів {@link FibonacciNumber}, що містять перші N чисел Фібоначчі.
     */
    public static List<FibonacciNumber> generateFibonacci(int N) {
        // Список об'єктів класу FibonacciNumberS
        List<FibonacciNumber> fibonacciNumbers = new ArrayList<>();
        int a = 1, b = 1;

        fibonacciNumbers.add(new FibonacciNumber(1, a));
        fibonacciNumbers.add(new FibonacciNumber(2, b));

        for (int i = 3; i <= N; i++) {
            int next = a + b;
            fibonacciNumbers.add(new FibonacciNumber(i, next));
            a = b;
            b = next;
        }
        return fibonacciNumbers;
    }

    /**
     * Головна функція програми.
     * Запитує у користувача кількість чисел Фібоначчі і цифру для перевірки,
     * після чого виводить перші N чисел Фібоначчі та числа, що закінчуються на задану цифру.
     *
     * @param args Аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел Фібоначчі (N): ");
        int N = scanner.nextInt();

        System.out.print("Введіть цифру (0-9), на яку повинні закінчуватись числа Фібоначчі: ");
        int digit = scanner.nextInt();

        if (digit < 0 || digit > 9) {
            System.out.println("Цифра повинна бути в діапазоні від 0 до 9.");
            return;
        }

        // Створення списку об'єктів класу FibonacciNumber
        List<FibonacciNumber> fibonacciNumbers = generateFibonacci(N);

        System.out.println("Перші " + N + " чисел Фібоначчі:");
        for (FibonacciNumber fibonacciNumber : fibonacciNumbers) {
            System.out.println(fibonacciNumber);
        }

        System.out.println("\nЧисла Фібоначчі, що закінчуються на цифру " + digit + ":");
        for (FibonacciNumber fibonacciNumber : fibonacciNumbers) {
            if (fibonacciNumber.endsWith(digit)) {
                System.out.println(fibonacciNumber);
            }
        }

        scanner.close();
    }
}