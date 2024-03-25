package Homework;

public class PezDispenser {
    private String name;
    private String color;
    private String model;
    private final int max_amount = 20;
    private int currentAmount;

    public PezDispenser(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.currentAmount = max_amount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //Task 1: Pez Dispenser gives 1 sweet at a time
    public void give() {
        if (getCurrentAmount() <= 0) {
            System.out.println("Pez dispenser is empty! Please, refill!");
        } else {
            System.out.println("Have a nice meal!");
            currentAmount--;
        }
    }

    //Task 2: Pez Dispenser gives a certain amount of sweets at a time
    public void give(int amountCount) {
        if (amountCount > currentAmount) {
            System.out.println("You can't take too much! Only " + currentAmount + " out of 20 sweets left!");
        } else {
            currentAmount = currentAmount - amountCount;
            System.out.println("You took " + amountCount + " sweets");
        }
    }

    //Task 3: Fill PEZ completely
    public void fill() {
        currentAmount = max_amount;
        System.out.println("PEZ is filled!");
    }

    //Task 4: Fill PEZ by 1 sweet at a time
    public void fillUp() {
        if (getCurrentAmount() >= max_amount) {
            System.out.println("You can put only 20 sweets");
        } else {
            System.out.println("+1 sweet!");
            currentAmount++;
        }
    }

    //Task 5: Fill PEZ by a certain amount
    public void fill(int amountCount) {
        if (currentAmount + amountCount > max_amount) {
            System.out.println("You can't add more than 20 sweets");
        } else {
            currentAmount = currentAmount + amountCount;
            System.out.println("You added " + amountCount + " sweets");
        }
    }
}