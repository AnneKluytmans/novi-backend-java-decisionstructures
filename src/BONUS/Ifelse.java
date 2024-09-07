package BONUS;

public class Ifelse {
    public static void main(String[] args) {

        // Call evenOrOdd
        int input1 = 8;
        int input2 = 1;
        int input3 = -1;
        int input4 = 0;

        evenOrOdd(input1);
        evenOrOdd(input2);
        evenOrOdd(input3);
        evenOrOdd(input4);

        // Call numberToGrade
        double gradeFrance = 6.3;
        double gradeEnglish = 7.5;
        double gradeMath = 3.6;

        numberToGrade(gradeFrance);
        numberToGrade(gradeEnglish);
        numberToGrade(gradeMath);
        numberToGrade(-3.0);

        //Call sortNumbers and biggest
        sortNumbers(8, 4);
        sortNumbers(0, 3);
        sortNumbers(2, -2);

        sortNumbers(2, 6, 9);
        sortNumbers(3, -3, -2);
        sortNumbers(3, 6, 9);

        biggestNumber(3, 8, 6);
        biggestNumber(5, 2, -3);
        biggestNumber(5, -6, 9);

        //Call positiveOrZeroOrNegative
        positiveOrZeroOrNegative(-995);
        positiveOrZeroOrNegative(305);
        positiveOrZeroOrNegative(0);
        positiveOrZeroOrNegative(1);
        positiveOrZeroOrNegative(-1);

        //Call ageCheck
        int[] ages = {1, 9, 10, 11, 17, 18, 19, 30, 64, 65, 66, 100};
        for (int i : ages){
            ageCheck(i);
        }

        //Call textLength
        textLength("Is this a long text?");
        textLength("Short");
        textLength("Half long text");

        //Call leapYear
        int year1 = 2024;
        int year2 = 1655;
        int year3 = 2000;
        int year4 = 1900;

        leapYear(year1);
        leapYear(year2);
        leapYear(year3);
        leapYear(year4);

        //Call triangleType
        triangleType(4, 4, 4);
        triangleType(3,3,6);
        triangleType(2,8,2);
        triangleType(1, 2, 4);

        //Call calculator
        calculator(2.5, 5.7, '*');
        calculator(3, 7.2, '+');
        calculator(1, -2, '-');
        calculator(7.6, 6, '/');
        calculator(1.5, 0, '/');
        calculator(6.4, 2.5, 'x');
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
            System.out.println("Grade " + grade + " is the same as grade F");
        } else if (grade > 0 && grade < 6.0) {
            System.out.println("Grade " + grade + " is the same as grade D");
        } else if (grade > 0 &&  grade < 7.0) {
            System.out.println("Grade " + grade + " is the same as grade C");
        } else if (grade > 0 &&  grade < 8.5) {
            System.out.println("Grade " + grade + " is the same as grade B");
        } else if (grade > 0 &&  grade <= 10.0) {
            System.out.println("Grade " + grade + " is the same as grade A");
        } else {
            System.out.println("Not a valid grade");
        }
    }

    //Assignment 3
    public static void sortNumbers(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number2 + " > " + number1);
        }
    }

    //Assignment 4
    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number!");
        } else if (number == 0) {
            System.out.println(number + " is zero!");
        } else {
            System.out.println(number + " is a negative number!");
        }
    }

    //Assignment 5
    public static void ageCheck(int age) {
        if (age < 10) {
            System.out.println("A person with age " + age + " is a child.");
        } else if (age < 18) {
            System.out.println("A person with age " + age + " is an adolescent.");
        } else if (age < 65) {
            System.out.println("A person with age " + age + " is an adult.");
        } else {
            System.out.println("A person with age " + age + " is a senior.");
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
    public static void sortNumbers (int number1, int number2, int number3) {
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

    //Assingment 8 *other solution*
    public static void biggestNumber (int number1, int number2, int number3) {
        int biggest = number1;

        if (number2 > biggest) {
            biggest = number2;
        }

        if (number3 > biggest) {
            biggest = number3;
        }

        System.out.println("The biggest number of " + number1 + ", " + number2 + " and " + number3 + " is " + biggest);
    }

    //Assignment 9
    public static void triangleType(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("The triangle with sides " + a + ", " + b + " and " + c + " is equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle with sides " + a + ", " + b + " and " + c + " is isosceles");
        } else {
            System.out.println("The triangle with sides " + a + ", " + b + " and " + c + " is unilateral");
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
