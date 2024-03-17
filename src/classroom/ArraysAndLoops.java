package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //ARRAY

        //Bread, Milk, Eggs, Fruits
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Spring", "Winter", "Autumn"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        //Print all grades
        System.out.println(Arrays.toString(grades));

        //Create empty array
        int[] emptyArray = new int[4];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        //Create string array with names;
        //Name count should be 5;
        //And print them all;
        String[] names = {"Marija", "Sofija", "Anna", "Kellija", "Bruno"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //Create double array with size of 5
        //Print empty array
        //Update each value from 0 to a number of your choice
        double[] anotheremptyarray = new double[5];
        System.out.println(Arrays.toString(anotheremptyarray));
        anotheremptyarray[0] = 56.5;
        anotheremptyarray[1] = 23.2;
        anotheremptyarray[2] = 5.89;
        anotheremptyarray[3] = 14.1;
        anotheremptyarray[4] = 77.45;
        System.out.println(Arrays.toString(anotheremptyarray));

        //LOOP

        //Print numbers from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Calculate sum from 1 to 100
        //Example 1+2+3+4+n
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        //for (Can control the length of massive to print)
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
        //i = 0 (counter)
        //Check if i < shoppinglist.lenght (4)
        //i = i + 1

        //1 iteration: System.out.println (Shoppinglist[0])
        //Print Bread
        //i = 1

        //2 iteration: System.out.println (Shoppinglist[1])
        //Print Milk
        //i = 2

        //Print all elements of massive
        for (String s : shoppingList) {
            System.out.println(s);
        }

        //Print number from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        //Exercise: Print even numbers from 2 to 100
        //Print in one line all numbers
        for (int b = 2; b <= 100; b++){
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
        }
        System.out.println(" ");
        //Variant 2:
        for (int b = 2; b <= 100; b = b + 2){
            System.out.print(b + " ");
        }
    }
}
