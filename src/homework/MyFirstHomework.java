package homework;

public class MyFirstHomework {
    public static void main(String[] args) {
        //Easy peasy
        int x = 10;
        if (x > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        //Odd or even
        int n = 16;
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //Age group classifier
        int age = 15;
        if (age <= 17) {
            System.out.println("Teenager");
        } else
            System.out.println("Adult");

        //Leap year checker
        int year = 2024;
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            // Leap year is either not divisible by 100 or divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        //Multiple conditions
        int number = 50;
        if (number > 0 && number % 2 == 0 && number < 100){
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid number");
        }

        //Nested conditions
        int p = 20;
        if (p > 0 && p % 2 == 0)
            System.out.println("Positive and Even");

        //Character type identifier
        char vowel = 'm';
        if (vowel == 'a' || vowel == 'A' || vowel == 'i' || vowel == 'I' || vowel == 'u'|| vowel == 'U'|| vowel == 'o'|| vowel == 'O'|| vowel == 'e'|| vowel == 'E')
            System.out.println("Vowel");
        else {
            System.out.println("Not a vowel");
        }

        //BMI calculator
        int weight = 80;
        int height = 2;
        int years = weight / (height * height);
        if (years <= 18) {
            System.out.println("Underweight");
        } else if (years >= 19 && years <= 24) {
            System.out.println("Healthy Weight");
        } else if (years >= 25 && years <= 30) {
            System.out.println("Overweight");
        } else
            System.out.println("Obesity");

        //Final grade
        int math = 85;
        int science = 59;
        int english = 97;
        int avg = (math + science + english) / 3;
        if (avg < 60) {
            System.out.println("Final grade is F");
        } else if (avg >= 60 && avg <= 69) {
            System.out.println("Final grade is D");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("Final grade is C");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Final grade is B");
        } else
            System.out.println("Final grade is A");

        //File extension checker
        String file = "program.doc";
        if (file.endsWith(".doc")) {
            System.out.println("Valid file extension");
        } else if (file.endsWith(".txt")) {
            System.out.println("Valid file extension");
        } else if (file.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        } else
            System.out.println("Invalid file extension");
    }
}
