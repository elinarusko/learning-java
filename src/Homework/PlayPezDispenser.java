package Homework;

public class PlayPezDispenser {
    public static void main(String[] args) {
        PezDispenser spiderman = new PezDispenser("spiderman", "black", "marvel");
        System.out.println(spiderman.getName());
        System.out.println(spiderman.getColor());
        System.out.println(spiderman.getModel());
        System.out.println(spiderman);

        System.out.println("Task 1");
        spiderman.give();
        System.out.println("Current amount: " + spiderman.getCurrentAmount());

        System.out.println("Task 2");
        spiderman.give(10);
        System.out.println("Current amount: " + spiderman.getCurrentAmount());

        System.out.println("Task 3");
        spiderman.fill();
        System.out.println("Current amount: " + spiderman.getCurrentAmount());

        spiderman.give();
        spiderman.give();
        spiderman.give();
        spiderman.give();
        System.out.println("Current amount: " + spiderman.getCurrentAmount());

        System.out.println("Task 4");
        spiderman.fillUp();
        System.out.println("Current amount: " + spiderman.getCurrentAmount());

        System.out.println("Task 5");
        spiderman.fill(4);
        System.out.println("Current amount: " + spiderman.getCurrentAmount());
    }
}
