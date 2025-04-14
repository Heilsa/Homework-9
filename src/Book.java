public class Book {
    public String nameOfBook;
    public String author;
    public int yearOfCreate;

    public Book(String nameOfBook, String author, int yearOfCreate) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfCreate = yearOfCreate;

    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearOfCreate() {
        return this.yearOfCreate;
    }
    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
}
