package homework;

public class MyFirstHomework {
    public static void main(String[] args) {
        //Easy peasy
        int x = 10;
        if (x > 0)
            System.out.println("Positive number");

        //Odd or even
        int n = 16;
        if (n%2==0)
            System.out.println("Even number");

        //Age group classifier
        int age = 15;
        if (age <= 17) {
            System.out.println("Teenager");
        }
        else
            System.out.println("Adult");

        //Leap year checker
        int year = 2024;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println("Leap year");

        //Multiple conditions
        int number = 50;
        if (number > 0 && number %2==0 && number < 100)
            System.out.println("Valid number");

        //Nested conditions
        int p = 20;
        if (p > 0 && p%2==0)
            System.out.println("Positive and Even");

        //Character type identifier
        char vowel = 'i';
        if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
            System.out.println("Vowel");

        //BMI calculator
        int weight = 80;
        int height = 2;
        int years = weight / (height * height);
        if (years <= 18) {
            System.out.println("Underweight");
        }
        else if (years >= 19 && years <= 24) {
            System.out.println("Healthy Weight");
        }
        else if (years >= 25 && years <= 30) {
            System.out.println("Overweight");
        }
        else
            System.out.println("Obesity");

        //Final grade
        int math = 85;
        int science = 59;
        int english = 97;
        int avg = (math+science+english)/3;
        if (avg < 60) {
            System.out.println("Final grade is F");
        }
        else if (avg >= 60 && avg <= 69) {
            System.out.println("Final grade is D");
        }
        else if (avg >= 70 && avg <= 79) {
            System.out.println("Final grade is C");
        }
        else if (avg >= 80 && avg <= 89) {
            System.out.println("Final grade is B");
        }
        else
            System.out.println("Final grade is A");

        //File extension checker
        String file = "program.doc";
        if (file.endsWith(".doc")) {
            System.out.println("Valid file extension");
        }
        else if (file.endsWith(".txt")) {
            System.out.println("Valid file extension");
        }
        else if (file.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        }
        else
            System.out.println("Invalid file extension");
    }
}
