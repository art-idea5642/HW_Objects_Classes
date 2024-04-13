import model.Author;
import model.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джером Дэвид", "Сэлинджер");
        Book book1 = new Book("Над пропастью во ржи", author1, 1951);
        Author author2 = new Author("Харпер", "Ли");
        Book book2 = new Book("Убить пересмешника", author2, 1960);
    }
}