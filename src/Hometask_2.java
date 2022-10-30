public class Hometask_2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        System.out.println();
        System.out.println("Задание 1");
        double deposit = 15000;
        double percent = 0.07;
        int target = 12_000_000;
        int month = 0;
        while (deposit < target) {
            deposit = deposit + deposit * percent;
            month++;
            System.out.println("Месяц " + month + ", сумма " + String.format("%.2f", deposit));
        }

    }

    public static void ex2() {
        System.out.println();
        System.out.println("Задание 2");
        double deposit = 15000;
        double percent = 0.07;
        int target = 12_000_000;
        int month = 0;
        while (deposit < target) {
            deposit = deposit + deposit * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма " + String.format("%.2f", deposit));
            }
        }
    }

    public static void ex3() {
        System.out.println();
        System.out.println("Задание 3");
        double deposit = 15000;
        double percent = 0.07;
        int targetTime = 9 * 12;
        int month = 0;
        while (month < targetTime) {
            deposit = deposit + deposit * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма " + String.format("%.2f", deposit));
            }
        }
    }

    public static void ex4() {
        System.out.println();
        System.out.println("Задание 4");
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
        }
    }
}


