import model.Author;
import model.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джером Дэвид", "Сэлинджер");
        Book book1 = new Book("Над пропастью во ржи", author1, 1951);
        Author author2 = new Author("Харпер", "Ли");
        Book book2 = new Book("Убить пересмешника", author2, 1960);
        book1.setYear(1952);
        book2.setYear(1961);
        System.out.println("Название книги: " + book1.getName() +
                ". Имя автора: " + book1.getAuthor() + ". Год издания: " + book1.getYear());
        System.out.println("Название книги: " + book2.getName() +
                ". Имя автора: " + book2.getAuthor() + ". Год издания: " + book2.getYear());
    }
}