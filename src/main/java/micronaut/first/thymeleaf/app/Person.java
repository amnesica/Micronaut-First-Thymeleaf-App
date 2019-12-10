package micronaut.first.thymeleaf.app;

/**
 * Class represents a simple Person with a name.
 */
public class Person {

    public String name;

    //Constructor
    public Person(String name) { this.name = name; }

    //Get the name of a person
    public String getName() { return name; }
}
