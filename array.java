public class Main {
    public static void main(String[] args) {

        // Array with predefined names (no user input)
        String[] names = {"Matthew", "James", "Peter", "John", "Andrew", "Philip"};

        System.out.println("Names:");

        // Display names with numbering
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}
