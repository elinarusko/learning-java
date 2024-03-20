package classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSun(67, 99));

        //Print Hello World 10 times
        printTextMultipleTimes("Hello World", 10);
        printTextMultipleTimes("My name is Elina", 2);

        //Call method printAllValuesFromStringArrays
        //You pass: array with fruits
        String[] fruits = {"banana, apple, pear" };
        printAllValuesFromStringArrays(fruits);

        System.out.println(isEven(10));

        int[] numbers = {3, 2, 5, 6};
        int arraysSum = sumOfNumber(numbers);
        System.out.println(arraysSum);
    }


    public static int calculateSun(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    //Create a method that receives String array and print all values from string array
    public static void printAllValuesFromStringArrays(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    //Create method that will return true if number is even or false if odd
    public static boolean isEven(int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    //    Task: Create a method that accepts int array and returns sum of number
    private static int sumOfNumber(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }
}

