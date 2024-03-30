package edu.penzgtu.ip.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {
    private int currentIndex = 0;
    private final List<Book> books;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return books.get(currentIndex++);
    }
}
