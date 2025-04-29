import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastname;

    public Author(String authorName, String authorLastname) {
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorLastname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorLastname, author.authorLastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorLastname);
    }
}