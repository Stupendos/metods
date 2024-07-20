import java.time.LocalDate;
import java.util.Arrays;
import java.time.Year;
public class Main {
    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void installSystem(int oC, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (oC == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oC == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oC == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oC == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void toDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2023;
        printIsLeapYear(year);

        System.out.println("Задача 2");
        int oC = 1;
        int clientDeviceYear = 2015;
        installSystem(oC, clientDeviceYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        toDeliveryDays(deliveryDistance);
        //
    }
}