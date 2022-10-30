public class Hometask_3 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        System.out.println();
        System.out.println("Задание 1");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = 0; i <= ending; i += 79) {
            if (i >= beginning)
                System.out.println(i);
        }
    }

    public static void ex2() {
        System.out.println();
        System.out.println("Задание 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}

