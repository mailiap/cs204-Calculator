import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(); // Create an instance of your Calculator class

        while (true) {
            String input = scanner.nextLine();  // Read user input
            String[] tokens = input.split(" ");  // Split input by spaces

            // Command handling
            switch (tokens[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(tokens[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(tokens[1])));
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
