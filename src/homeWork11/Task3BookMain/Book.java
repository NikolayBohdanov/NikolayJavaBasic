package homeWork11.Task3BookMain;

public class Book {

    public static void main(String[] args) {
        Book book = new Book();
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        book.result(title);
        book.result(author);
        book.result(content);
    }

    public void show() {
    }

    public void result(Book info) {
        info.show();
    }
}
