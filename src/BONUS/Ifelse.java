package BONUS;

public class Ifelse {
    public static void main(String[] args) {
        int input1 = 3;
        double grade = 6.3;
        int age = 53;
        String text = "Is this a long text?";
        int year = 2024;

        evenOrOdd(input1);
        numberToGrade(grade);
        biggestNumber(8, 4);
        positiveOrZeroOrNegative(-9);
        ageCheck(age);
        textLength(text);
        leapYear(year);
        biggestNumber(2, 6, 9);
        triangleType(3,3,6);
        calculator(2.5, 5.7, '*');

    }

    //Assignment 1
    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even!");
        } else {
            System.out.println(number + " is odd!");
        }
    }

    //Assignment 2
    public static void numberToGrade(double grade) {
        if (grade > 0 && grade <= 5.5) {
            System.out.println("The grade " + grade + " is the same as grade F");
        } else if (grade < 6.0) {
            System.out.println("The grade " + grade + " is the same as grade D");
        } else if (grade < 7.0) {
            System.out.println("The grade " + grade + " is the same as grade C");
        } else if (grade < 8.5) {
            System.out.println("The grade " + grade + " is the same as grade B");
        } else if (grade <= 10.0) {
            System.out.println("The grade " + grade + " is the same as grade A");
        } else {
            System.out.println("Not a valid grade");
        }
    }

    //Assignment 3
    public static void biggestNumber(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number2 + " > " + number1);
        }
    }

    //Assignment 4
    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    //Assignment 5
    public static void ageCheck(int age) {
        if (age < 10) {
            System.out.println("This person is a child.");
        } else if (age < 18) {
            System.out.println("This person is an adolescent.");
        } else if (age < 65) {
            System.out.println("This person is an adult.");
        } else {
            System.out.println("This person is a senior.");
        }
    }

    //Assignment 6
    public static void textLength(String text) {
        int length = text.length();

        if (length < 10) {
            System.out.println("This is a short text");
        } else if (length < 20) {
            System.out.println("This is a half-long text");
        } else {
            System.out.println("This is a long text");
        }
    }

    //Assignment 7
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }


    //Assignment 8
    public static void biggestNumber (int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            if (number2 >= number3) {
                System.out.println(number1 + " > " + number2 + " > " + number3);
            } else {
                System.out.println(number1 + " > " + number3 + " > " + number2);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            if (number3 >= number1) {
                System.out.println(number2 + " > " + number3 + " > " + number1);
            } else {
                System.out.println(number2 + " > " + number1 + " > " + number3);
            }
        } else {
            if (number1 >= number2) {
                System.out.println(number3 + " > " + number1 + " > " + number2);
            } else {
                System.out.println(number3 + " > " + number2 + " > " + number1);
            }
        }
    }

    //Assignment 9
    public static void triangleType(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is unilateral");
        }
    }

    //assignment 10
    public static void calculator(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(number1 + " + " + number2 + " is " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " is " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

}
