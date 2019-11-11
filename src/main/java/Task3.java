import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
     System.out.println(third());
    }

    static Integer third() {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first > second && first > third) {
            return 1;
        }
        else if (second > first && second > third) {
            return 1;
        }
        else if (third > first && third > second) {
            return 1;
        }
        else if (first == second && first > third) {
            return 2;
        }
        else if (first == third && first > second) {
            return 2;
        }
        else if (second == third && second > first) {
            return 2;
        }
        else if (first == second && second == third) {
            return 3;
        }

        return null;
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