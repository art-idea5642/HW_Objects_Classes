package model;

public class Book {
   private String name;
   private Author author;
   private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return publicationYear;
    }

    public void setYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
