public class MainV2 {
    public static void main(String[] args) {
        Author author2 = new Author("Скальд", "Вальгаллов");
        Book book2 = new Book("Án ótta", author2, 1009);
        System.out.println(book2);
        book2.setYearOfCreate(1221);
        System.out.println("Год книги был изменён на = " + book2.getYearOfCreate());
    }

}