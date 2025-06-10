package org.example;

public abstract class LibraryItem {
    protected String title;
    protected String author;
    protected int year;


    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public String toString() {
        return "Book: "+this.title+" by "+this.author;
    }
}


