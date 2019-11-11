import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)
    {
     System.out.println(second());
    }

    static String second() {
        Scanner scanner = new Scanner(System.in);

        Integer first = scanner.nextInt();
        Integer second = scanner.nextInt();
        Integer third = scanner.nextInt();

        if (first > second && first < third) {
            return Integer.toString(first);
        }
        else if (second > first && second < third) {
            return Integer.toString(second);
        }
        else if (third > second && third < first) {
            return Integer.toString(third);
        }
        else {
            return "Нет";
        }
    }

    static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }

        for (Integer i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}