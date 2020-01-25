package com.robert;

public class Book {
    private String title;
    private String author;
    private int publicationDate;

    public Book(String mTitle, String author, int publicationDate) {
        this.title = mTitle;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", PublicationDate=" + publicationDate +
                '}';
    }
}
