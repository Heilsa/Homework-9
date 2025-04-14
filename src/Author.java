public class Author {
    public String authorName;
    public String authorLastname;

    public Author(String authorName, String authorLastname) {
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorLastname() {
        return this.authorLastname;
    }
}