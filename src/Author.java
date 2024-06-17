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

    public boolean equals(Author other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
