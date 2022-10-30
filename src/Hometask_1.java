public class Hometask_1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {

        System.out.println();
        System.out.println("Задание 1");
        int part = 15000;
        double sumWithPercent = 0;
        double percent = 0.01;
        int i = 0;
        while (sumWithPercent < 2_459_000) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", sumWithPercent) + " рублей");
    }

    public static void ex2() {
        System.out.println();
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void ex3() {
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int bornPerYear = 17;
        int deathPerYear = 8;
        int populationIncrease; // прирост в год
        int populationDecrease; // убыль в год
        for (int i = 1; i <= 10; i++) {
            populationIncrease = (population * bornPerYear) / 1000;   // прирост в год
            populationDecrease = (population * deathPerYear) / 1000;  // убыль в год
            population = population + (populationIncrease - populationDecrease);
            System.out.println("Год:" + i + " " + population);
        }
    }
}