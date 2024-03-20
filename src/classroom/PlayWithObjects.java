package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(2);
        barsik.setColor("grey");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("leo");
        leo.setAge(1);
        leo.setColor("black");
        System.out.println(leo.getName());

        System.out.println(leo);
        System.out.println(barsik);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        //Create 2 objects
        //Update info for each
        //Call walk and eat

        Animal lucky = new Animal();
        lucky.setName("lucky");
        lucky.setAge(4);
        lucky.setColor("brown");

        lucky.walk();
        lucky.eat();

        System.out.println(lucky);

        Animal buddy = new Animal();
        buddy.setName("buddy");
        buddy.setAge(3);
        buddy.setColor("white");

        buddy.walk();
        buddy.eat();

        System.out.println(buddy);
    }
}
