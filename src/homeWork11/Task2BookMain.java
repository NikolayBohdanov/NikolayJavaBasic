package homeWork11;

import java.util.Scanner;

public class Task2BookMain {
    //Требуется: Создать класс Book(Main). Создать классы Title, Author и Content,
    //каждый из которых должен содержать одно строковое поле и метод void show ().
    //Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
    //Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
    public static void main(String[] args) {
        String bookName;
        String bookAuthor;
        String bookContent;
        Scanner user = new Scanner(System.in);
        System.out.println("Hi there!");
        System.out.println("Here you can update your books list.");
        System.out.println("Please input Name of your book: ");
        bookName = user.nextLine();
        System.out.println("Please input Author of your book: ");
        bookAuthor = user.nextLine();
        System.out.println("Please input Content of your book: ");
        bookContent = user.nextLine();
        Title book1 = new Title();
        book1.show(bookName);
        Author book11 = new Author();
        book1.show(bookAuthor);

        book1.show(bookContent);

    }
}

class Title {
    String title;

    void show(String bookName) {
        title = bookName;
        System.out.println("Your book title: " + title);
    }
}

class Author {
    String author;

    void show(String bookAuthor) {
        author = bookAuthor;
        System.out.println("Your book Author: " + author);
    }
}

class Content {
    String content;

    void show(String bookContent) {
        content = bookContent;
        System.out.println("Your book Content: " + content);

    }
}
