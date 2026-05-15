import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Creates a resizable list for grocery items
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("Create grocery list:");
        System.out.println("Type \"finish\" to create the list.");

        // Runs until key word "Finish" is typed
        while (true) {

            System.out.print("Item: ");
            String item = scanner.nextLine();

            // Finishes when "finish" is read
            if (item.equalsIgnoreCase("finish")) {
                break;
            }

            // Adds item
            groceryList.add(item);
        }

        // Display
        System.out.println("\nCreated.");
        System.out.println("Total Items: " + groceryList.size());

        System.out.println("\nItems:");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
}
