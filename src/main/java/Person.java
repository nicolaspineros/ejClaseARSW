import java.time.LocalDate;

public class Person {
    public String getEmailAddress() {
        return emailAddress;
    }

    public enum Sex {
        MALE, FEMALE, OTHER
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 0;
    }
    public Sex getGender() {
        return gender;
    }

    public void printPerson() {
        System.out.println("Name: " + name);
    }
}