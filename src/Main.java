import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] stringNumbers = s.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String stringNumber : stringNumbers) {
            numbers.add(Integer.parseInt(stringNumber));
        }

        for(int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
