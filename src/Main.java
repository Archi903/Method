public class Main {
    public static void calculateLeapYear(int selectYear) {

        if (selectYear % 4 == 0) {
            if ((selectYear % 100 != 0) || (selectYear % 400 == 0)) {
                System.out.println(selectYear + " год является високосным");
            }
        }
        if (selectYear % 4 != 0 || selectYear % 100 == 0) {
            if (selectYear % 400 != 0) {
                System.out.println(selectYear + " год не является високосным");
            }
        }
    }

    public static void chooseSoftware(int clientOS, int clientDeviceYear) {

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static void calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance <= 59 && deliveryDistance > 19) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100 && deliveryDistance > 59) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задание 1");

        int selectYear = 2012;
        calculateLeapYear(selectYear);
    }

    public static void task2() {
        System.out.println("Задание 2");

        int clientOS = 1;
        int clientDeviceYear = 2015;
        chooseSoftware(clientOS, clientDeviceYear);


    }

    public static void task3() {
        System.out.println("Задание 3");

        int deliveryDistance = 120;
        calculateDeliveryDistance(deliveryDistance);

    }
}