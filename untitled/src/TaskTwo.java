import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strOne = bufferedReader.readLine();
        String strTwo = bufferedReader.readLine();

        equalsString(strOne,strTwo);
    }
    public static void equalsString(String strOne, String strTwo) {
        if (strOne.equals(strTwo)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
