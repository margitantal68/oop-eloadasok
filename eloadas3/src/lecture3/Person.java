package lecture3;

public class Person {
    // implicit initialization - null
    private String firstName;
    // explicit initialization
    private String lastName = "BLACK";

    // constructor initialization
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
