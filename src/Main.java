public class Main {
    public static void calculateLeapYear(int selectYear) {

        if (selectYear % 4 == 0 && selectYear % 100 != 0 || selectYear % 400 == 0) {
            System.out.println(selectYear + " год является високосным");
        } else {
            System.out.println(selectYear + " год не является високосным");
        }
    }

    public static void chooseSoftware(int clientOS, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int calculateDeliveryDistance(int deliveryDistance) {

        int days = 1;
        for (int distanceLength = 20; distanceLength <= deliveryDistance; distanceLength = distanceLength + 40) {
            days = days + 1;
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задание 1");

        int selectYear = 2000;
        calculateLeapYear(selectYear);
    }

    public static void task2() {
        System.out.println("Задание 2");

        int clientOS = 1;
        int clientDeviceYear = 2014;
        chooseSoftware(clientOS, clientDeviceYear);


    }

    public static void task3() {
        System.out.println("Задание 3");

        int deliveryDistance = 50;
        int result = calculateDeliveryDistance(deliveryDistance);
        if (result < 4) {
            System.out.println("Потребуется дней: " + result);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}