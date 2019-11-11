import java.util.Scanner;

public class Task5 {

    public static void main(String[] args)
    {
        System.out.println(6 / 2 * 3);
     fifth();
    }

    static void fifth() {
        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();

        Integer i = 0;
        Integer j = 0;
        while (true) {
            if (isSimple(i)) {
                System.out.println(i);
                j++;

                if (j == number) {
                    return;
                }
            }
            i++;
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