public class Main {
    @Override
    public String toString() {
        return "author";
    }

    public static void main(String[] args) {
        Author author = new Author("Скальд", "Вальгаллов");
        Book book = new Book("Án ótta", author, 1009);
        System.out.println(book);
    }
}