package lesson9.lecture.models;

public class TransformedPerson {
    private String firstName;

    public TransformedPerson(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "TransformedPerson{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}