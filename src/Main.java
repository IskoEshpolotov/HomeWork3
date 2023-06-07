public class Main {
    public static void main(String[] args) {
        double numbers[] = {1.2, 3.2, -4.3, 3.6, -7.8, -9.1, 5.2, 9.8, -1.6, -8.1, 9.5, -5.6, 5.2, 1.7, 8.2};
        double summa = 0.0;
        int col = 0;
        boolean proverka = false;
        for (double foreach : numbers) {
            if (foreach < 0) {
                proverka = true;
            } else if (foreach > 0 && proverka) {
                summa += foreach;
                col++;
                System.out.println(foreach);

            }

        }
        System.out.println("Арифметичсекое число " + summa / col);

    }
}