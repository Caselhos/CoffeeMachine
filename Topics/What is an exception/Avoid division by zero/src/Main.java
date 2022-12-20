import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result = 0;
        try {
            result = a / ((b + c) / d);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by zero!");
            System.exit(0);
        }

        System.out.println(result);
    }
}