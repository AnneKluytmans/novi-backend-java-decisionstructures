package BONUS;

public class Loops {
    public static void main(String[] args) {
        //Assignment 1
        int sumEvenNumbers = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumEvenNumbers += i;
            }
        }
        System.out.println("The sum of all even numbers between 0 and 100 is: " + sumEvenNumbers);

        //Assignment 2
        System.out.println(" ");
        System.out.println("A list of the power of 2 under 1000:");
        for (int i = 1; i < 1000; i*= 2) {
            System.out.println(i);
        }


        //Assignment 3
        int[] arrayNumbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        boolean isInit = false;
        for (int i = 0; i < arrayNumbers.length; i++) {
           if (arrayNumbers[i] == 45) {
               isInit = true;
               break;
           }
        }

        System.out.println(" ");
        if (isInit) {
            System.out.println("This array includes the number 45");
        } else {
            System.out.println("This array does not include the number 45");
        }


        //Assignment 4
        int sumArray = 0;
        int [] arraySum =  {12, 5, 7, 2, 18, 3, 9, 12};

        for (int i = 0; i < arraySum.length; i++) {
            sumArray += arraySum[i];
        }

        System.out.println(" ");
        System.out.println("The sum of all numbers in the array is: " + sumArray);

        //Assignment 5
        System.out.println(" ");
        System.out.println("All the items in the array before an empty String");
        String [] arrayStrings =  {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};

        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i] != "") {
                System.out.println(arrayStrings[i]);
            } else {
                break;
            }
        }

        //Assignment 6
        System.out.println(" ");
        System.out.println("All prime numbers between 1 and 100:");
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        //Assignment 7
        System.out.println(" ");
        System.out.println("All numbers in the array bigger then 45:");
        int [] arrayNumbers2 = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        for (int i = 0; i < arrayNumbers2.length; i++) {
            if (arrayNumbers2[i] > 45) {
                System.out.println(arrayNumbers2[i]);
            }
        }

        //Assignment 8
        System.out.println(" ");
        System.out.println("Countdown from 10 to 1:");
        for (int i = 10; i >=1; i--) {
            System.out.println(i);
        }

        //Assignment 9
        System.out.println(" ");
        System.out.println("The first 10 fibonacci numbers");

        int number1 = 0;
        int number2 = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(number1);

            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }


        //Assignment 10  (hoe krijg je ook de spaties?)
        System.out.println(" ");
        String stars = "";

        for (int i = 0; i < 8; i++) {
            stars += "*";
            System.out.println(stars);
        }

    }


    //Assignment 6 isPrime method
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
