import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name = " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return this.firstName.equals(otherAuthor.firstName) && this.lastName.equals(otherAuthor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
