import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        System.out.println(StringUtils.reverseWithLoop("hello"));
        System.out.println(StringUtils.reverseWithBuilder("hello"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput a string to reverse: ");
        String userString = scanner.nextLine();
        System.out.println("With Loop: " + StringUtils.reverseWithLoop(userString));
        System.out.println("With Builder: " + StringUtils.reverseWithBuilder(userString));

        scanner.close();
    }
}
