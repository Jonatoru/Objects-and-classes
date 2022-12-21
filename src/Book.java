import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publicationYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, publicationYear);
    }

    public Book(Author author, String nameBook, int publicationYear) {
        this.nameBook = nameBook;
        this.author = new Author (author.getAuthorName(), author.getAuthorSurname());
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Автор, название книги, год издания: " + author + ", "+ nameBook +", " + publicationYear +'.';
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