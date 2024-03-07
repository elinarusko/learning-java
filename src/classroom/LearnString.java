package classroom;

public class LearnString {
    public static void main(String[] args) {

        //String
        String name = "Elina";
        String lastName = "Rusko";
        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print name and surname
        String fullname = name + " " + lastName;
        System.out.println(fullname);

        //Same example
        System.out.println(name + " " + lastName);
        System.out.println(String.format("%s %s",name, lastName));

        //Can save into variable
        String myFullName = String.format("%s %s",name, lastName);
        System.out.println(myFullName);

        //Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloworld = hello.concat(world);
        System.out.println(helloworld);

        //Exercise:
        //Declare a string variable with your name
        //Declare a string variable with your favouring programming language
        //Concatenate the two strings to form a message "My Name is {Name}. I love coding in {Language}"
        //Print it out
        String myName = "My name is Elina. ";
        String language = "I love coding in Java.";
        String message = myName.concat(language);
        System.out.println(message);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
