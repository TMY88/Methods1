import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void checkLeapYear(int yearForCheck) {
        if (yearForCheck % 4 == 0 && yearForCheck%100 != 0 || yearForCheck % 400 == 0) {
            System.out.println(yearForCheck + "  год — високосный год");
        }else {
            System.out.println(yearForCheck + "  год — невисокосный год");
        }
    }
    public static void task1() {
        System.out.println("Задание 1");
        int year = 1996;
        checkLeapYear(year);
    }
    public static void checkTypeOsAndYear (int typeOS, int year) {
        int currenYear = LocalDate.now().getYear();
        if (typeOS==0){
            if (year == currenYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (typeOS == 1) {
            if (year == currenYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Не ыерно указана OS!");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int phoneOS=0;
        int prodPhoneYear = 2021;
        checkTypeOsAndYear(phoneOS, prodPhoneYear);
    }

    public static void calculateDeliveryDate(int distance) {
        int days = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: "+days);
        }else if (distance>20 && distance<=60) {
            System.out.println("Потребуется дней: "+(days+1));
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculateDeliveryDate(deliveryDistance);
    }
}