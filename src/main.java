public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jason", "Schreier");
        Author author2 = new Author("William", "Shakespeare");
        Author author3 = new Author("William", "Shakespeare");

        Book book1 =  new Book("Blood, sweat, and pixels", author1, 2017);
        Book book2 = new Book("Hamlet", author2, 1623);
        Book book3 = new Book("Hamlet", author2, 1623);

        System.out.println("Author 1: " + author1.toString());
        System.out.println("Author 2: " + author2.toString());
        System.out.println("Author 3: " + author3.toString());

        System.out.println("Book 1: " + book1.toString());
        System.out.println("Book 2: " + book2.toString());
        System.out.println("Book 3: " + book3.toString());

        System.out.println("Author 1 == Author 2: " + author1.equals(author2));
        System.out.println("Author 2 == Author 3: " + author2.equals(author3));

        System.out.println("Book 1 == Book 2: " + book1.equals(book2));
        System.out.println("Book 2 == Book 3: " + book2.equals(book3));

        System.out.println("Author 1 hashCode = " + author1.hashCode());
        System.out.println("Author 2 hashCode = " + author2.hashCode());
        System.out.println("Author 3 hashCode = " + author3.hashCode());

        System.out.println("Book 1 hashCode = " + book1.hashCode());
        System.out.println("Book 2 hashCode = " + book2.hashCode());
        System.out.println("Book 3 hashCode = " + book3.hashCode());
    }
}
