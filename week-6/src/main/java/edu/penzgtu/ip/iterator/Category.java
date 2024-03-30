package edu.penzgtu.ip.iterator;

import java.util.Iterator;
import java.util.List;

public class Category implements Iterable<Book> {
    private final List<Book> books;

    public Category(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}