import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)
    {
     System.out.println(first());
    }

    static String first() {
        Scanner scanner = new Scanner(System.in);

        Integer first = scanner.nextInt();
        Integer second = scanner.nextInt();
        Integer third = scanner.nextInt();

        if (first == second || second == third || first == third) {
            return "Есть одинаковые";
        }
        else {
            return "Нет одинаковых";
        }
    }
}