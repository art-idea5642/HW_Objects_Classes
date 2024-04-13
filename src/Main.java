import model.Author;
import model.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джером Дэвид", "Сэлинджер");
        Book book1 = new Book("Над пропастью во ржи", author1, 1951);
        Author author2 = new Author("Харпер", "Ли");
        Book book2 = new Book("Убить пересмешника", author2, 1960);
        Author author3 = new Author("Джером Дэвид", "Сэлинджер");
        Book book3 = new Book("Над пропастью во ржи", author3, 1951);
        book1.setYear(1952);
        book2.setYear(1961);
        book3.setYear(1952);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(author1.equals(author3));
    }
}