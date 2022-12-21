import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    public  Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
}