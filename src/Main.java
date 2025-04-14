public class Main {
    public static void main(String[] args) {
        Book book = new Book("Án ótta", "Fólk", 1009);
        Author author = new Author("Скальд", "Вальгаллович");
        System.out.println("Название книги,автор и год издания = " + book.nameOfBook + " , " + book.author + " , " + book.yearOfCreate + " год");
        System.out.println("Имя и фамилия автора = " + author.authorName + " " + author.authorLastname);
    }
}