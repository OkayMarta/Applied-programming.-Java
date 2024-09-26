import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Клас Abiturient представляє абітурієнта з його ідентифікатором, прізвищем, ім'ям, по батькові, адресою, номером телефону та середнім балом.
 */
public class Abiturient {

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private double averageScore;

    /**
     * Конструктор для створення об'єкта Abiturient.
     *
     * @param id            ідентифікатор абітурієнта
     * @param lastName      прізвище абітурієнта
     * @param firstName     ім'я абітурієнта
     * @param middleName    по батькові абітурієнта
     * @param address       адреса абітурієнта
     * @param phone         номер телефону абітурієнта
     * @param averageScore середній бал абітурієнта
     */
    public Abiturient(int id, String lastName, String firstName, String middleName, String address, String phone, double averageScore) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.averageScore = averageScore;
    }

    //Геттери та сеттери
    /**
     * Повертає ідентифікатор абітурієнта.
     *
     * @return ідентифікатор абітурієнта
     */
    public int getId() {
        return id;
    }

    /**
     * Встановлює ідентифікатор абітурієнта.
     *
     * @param id новий ідентифікатор абітурієнта
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Повертає прізвище абітурієнта.
     *
     * @return прізвище абітурієнта
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Встановлює прізвище абітурієнта.
     *
     * @param lastName нове прізвище абітурієнта
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Повертає ім'я абітурієнта.
     *
     * @return ім'я абітурієнта
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Встановлює ім'я абітурієнта.
     *
     * @param firstName нове ім'я абітурієнта
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Повертає по батькові абітурієнта.
     *
     * @return по батькові абітурієнта
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Встановлює по батькові абітурієнта.
     *
     * @param middleName нове по батькові абітурієнта
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Повертає адресу абітурієнта.
     *
     * @return адреса абітурієнта
     */
    public String getAddress() {
        return address;
    }

    /**
     * Встановлює адресу абітурієнта.
     *
     * @param address нова адреса абітурієнта
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Повертає номер телефону абітурієнта.
     *
     * @return номер телефону абітурієнта
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Встановлює номер телефону абітурієнта.
     *
     * @param phone новий номер телефону абітурієнта
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Повертає середній бал абітурієнта.
     *
     * @return середній бал абітурієнта
     */
    public double getAverageScore() {
        return averageScore;
    }

    /**
     * Встановлює середній бал абітурієнта.
     *
     * @param averageScore новий середній бал абітурієнта
     */
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    /**
     * Перевизначений метод для рядкового представлення об'єкта Abiturient.
     *
     * @return рядкове представлення об'єкта Abiturient
     */
    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}