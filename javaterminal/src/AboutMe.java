import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your last name?");
        String lastName = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What's your height?");
        double height = scanner.nextDouble();

        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + height + "m");
    }
}
