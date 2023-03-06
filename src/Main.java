import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();

        System.out.println("Приветствую "+name);
        in.close();

        System.out.println("-------------------");
        System.out.println("| градусы | sin() |");
        System.out.println("-------------------");
        for (int i = 0; i <= 45; i+=5){
            double degrees = i;
            double radians = Math.toRadians(degrees);
            double sin =  Math.sin(radians);

            System.out.println("|  " + degrees + "  | "+ String.format("%.4f", sin) + " |");
            System.out.println("-------------------");
        }
    }
}
