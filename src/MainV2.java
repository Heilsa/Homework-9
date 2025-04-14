public class MainV2 {
    public static void main(String[] args) {
        Book book2 = new Book("Án ótta", "Fólk", 1009);
        Author author2 = new Author("Скальд", "Вальгаллович");
        book2.setYearOfCreate(1221);
        System.out.println("Год книги был изменён на = " + book2.yearOfCreate);
    }
}
