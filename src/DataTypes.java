public class DataTypes {
    public static void main(String[] args) {
        // First comment
        /*
        Hello World
        I am working on this file
         */

        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise
        char E = 69;
        System.out.println(E);
        char L = 76;
        System.out.println(L);
        char I = 73;
        System.out.println(I);
        char N = 78;
        System.out.println(N);
        char A = 65;
        System.out.println(A);

        //Boolean is/has
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
