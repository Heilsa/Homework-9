public class Author {
    private String authorName;
    private String authorLastname;

    public Author(String authorName, String authorLastname) {
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }

    public String getNewAuthorLastname() {
        return authorLastname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorLastname;
    }
}