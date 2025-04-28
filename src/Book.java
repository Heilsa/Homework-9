import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author author;
    private int yearOfCreate;

    public Book(String nameOfBook, Author author, int yearOfCreate) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfCreate = yearOfCreate;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }


    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Название книги: '" + nameOfBook + "', Автор: " + author.toString() + ", Год издания: " + yearOfCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfCreate == book.yearOfCreate && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearOfCreate);
    }
}