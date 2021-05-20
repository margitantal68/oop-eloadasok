package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private final String firstname;
    private final String lastname;
    private transient String password;
    private final int ID;

    private static int counter;

    public Student(String firstname, String lastname) {
        this.ID = ++counter;
        this.password ="xxxx";
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString(){
        return ID + " " + firstname + " " + lastname + " password: " + password;
    }

    public static int getCounter(){
        return counter;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
}
