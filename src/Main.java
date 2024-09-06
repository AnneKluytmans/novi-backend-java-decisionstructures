public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    public static void hello() {
        System.out.println("Hello, World");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void postiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "Henk":
                System.out.println("Henk's favorite drink is pina colada");
                break;
            case "Rob":
                System.out.println("Rob's favorite drink is beer");
                break;
            case "Ilona":
                System.out.println("Ilona's favorite drink is tea");
                break;
            case "Anne":
                System.out.println("Anne's favorite drink is hot chocolate");
                break;
            default:
                System.out.println("No favorite drink!");
        }
    }

    public static void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
