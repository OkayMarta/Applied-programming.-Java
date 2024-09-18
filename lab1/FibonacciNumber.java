/**
 * Клас для представлення числа Фібоначчі з його номером у послідовності і значенням.
 */
public class FibonacciNumber {
    private int index;
    private int value;

    /**
     * Конструктор для створення об'єкта числа Фібоначчі.
     *
     * @param index Номер числа у послідовності Фібоначчі.
     * @param value Значення числа Фібоначчі.
     */
    public FibonacciNumber(int index, int value) {
        this.index = index;
        this.value = value;
    }

    /**
     * Повертає номер числа у послідовності Фібоначчі.
     *
     * @return Номер числа Фібоначчі.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Повертає значення числа Фібоначчі.
     *
     * @return Значення числа Фібоначчі.
     */
    public int getValue() {
        return value;
    }

    /**
     * Перевіряє, чи закінчується число Фібоначчі на задану цифру.
     *
     * @param digit Цифра, на яку повинно закінчуватися число.
     * @return true, якщо значення числа Фібоначчі закінчується на задану цифру; інакше false.
     */
    public boolean endsWith(int digit) {
        return value % 10 == digit;
    }

    /**
     * Перевизначений метод для рядкового представлення числа Фібоначчі.
     *
     * @return Рядкове представлення числа Фібоначчі у форматі "Число Фібоначчі №index = value".
     */
    @Override
    public String toString() {
        return "Число Фібоначчі №" + index + " = " + value;
    }
}