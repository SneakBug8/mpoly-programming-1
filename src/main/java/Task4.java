import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)
    {
     System.out.println(forth());
    }

    static float forth() {
        Scanner scanner = new Scanner(System.in);

        float number = scanner.nextFloat();

        if (number < 0) {
            return Math.abs(number - 0);
        }
        else if (number > 1) {
            return Math.abs(number - 1);
        }
        else {
            return 0;
        }
    }
}