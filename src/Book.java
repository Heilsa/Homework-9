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

    public void getAuthor() {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги: '" + nameOfBook + "', Автор: " + author.toString() + ", Год издания: " + yearOfCreate;
    }

}