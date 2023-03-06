import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        hello();
        printTableSin(720, 10);

    }
    private static void hello() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();

        System.out.println("Приветствую "+name);
        in.close();
    }

    /**
     * Вывод таблицы синусов, с шагом в step до конечного угла endDegress, начиная с нулевого угла
     * @param endDegress начальный угол
     * @param step шаг угла
     */
    private static void printTableSin(int endDegress, int step) {
        final String line = "-------------------";
        System.out.println(line);
        System.out.println("| градусы | sin() |");
        System.out.println(line);
        for (int i = 0; i <= endDegress; i+=step){
            double degrees = i;
            double radians = Math.toRadians(degrees);
            double sin =  Math.sin(radians);

            System.out.println("|  " + degrees + "  | "+ String.format("%.4f", sin) + " |");
            System.out.println(line);
        }
    }

}
