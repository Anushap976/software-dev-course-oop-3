package org.example;

import java.nio.file.FileVisitOption;

public class Book extends LibraryItem {
    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void readBook() {
        System.out.println("Book Title \"" + getTitle() + "\" Author " + getAuthor() + "\" Year" + getYear());
    }

    public String toString() {
        return super.toString() + " (" + getYear() + ") - " + this.pageCount + " pages";
    }
}
