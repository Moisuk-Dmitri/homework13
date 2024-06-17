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

    public boolean equals(Book other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.name.equals(other.name) && this.author.equals(other.author) && this.publicationYear == other.publicationYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, publicationYear);
    }
}
