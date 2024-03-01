import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strOne = bufferedReader.readLine();
        String strTwo = bufferedReader.readLine();

        int numberOne = Integer.parseInt(strOne);
        int numberTwo = Integer.parseInt(strTwo);

        equalsTwoNumbers(numberOne, numberTwo);
        System.out.println("-----------------------**---------------------");
        calculationsTwoNumbers(Double.parseDouble(strOne), Double.parseDouble(strTwo));
    }
    public static void equalsTwoNumbers(int a, int b) {
        if (a > b) System.out.println("a > b");
        if (a < b) System.out.println("a < b");
        if (a == b) System.out.println("a = b");
    }

    public static void calculationsTwoNumbers(double  a, double b) {
        System.out.printf("a + b = %f\n", a + b);
        System.out.printf("a * b = %f\n", a * b);
        System.out.printf("a - b = %f\n", a - b);
        System.out.printf("a / b = %f\n", a / b);
    }
}
