import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        // array of names
        String[] names = {"Matthew", "James", "Peter", "John", "Andrew", "Philip"};

        System.out.println("names:");

        // Display names
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}
