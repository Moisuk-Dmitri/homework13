import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", author = " + author.toString() + ", publication year = " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return this.name.equals(otherBook.name) && this.author.equals(otherBook.author) && this.publicationYear == otherBook.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}
