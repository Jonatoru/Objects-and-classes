public class Book {
    private String nameBook;
    private Author author;
    private int publicationYear;

    public Book(Author author, String nameBook, int publicationYear) {
        this.nameBook = nameBook;
        this.author = new Author (author.authorName, author.authorSurname);
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}