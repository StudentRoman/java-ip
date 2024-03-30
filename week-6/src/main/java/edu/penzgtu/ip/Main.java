package edu.penzgtu.ip;

import edu.penzgtu.ip.adapter.NewPaymentGateway;
import edu.penzgtu.ip.adapter.NewPaymentGatewayAdapter;
import edu.penzgtu.ip.adapter.PaymentGateway;
import edu.penzgtu.ip.builder.AdminUserBuilder;
import edu.penzgtu.ip.builder.User;
import edu.penzgtu.ip.builder.UserBuilder;
import edu.penzgtu.ip.builder.UserManager;
import edu.penzgtu.ip.iterator.Book;
import edu.penzgtu.ip.iterator.Category;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Builder pattern
        UserBuilder builder = new AdminUserBuilder();
        UserManager manager = new UserManager(builder);
        User user = manager.createUser();

        System.out.println(user);

        // Adapter pattern
        NewPaymentGateway newPaymentGateway = new NewPaymentGateway();
        PaymentGateway newPaymentGatewayAdapter = new NewPaymentGatewayAdapter(newPaymentGateway);

        newPaymentGatewayAdapter.paymentProcess("credit", 100.0);
        newPaymentGatewayAdapter.paymentProcess("cash", 50.0);

        // Iterator pattern
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book #1", "Author #1", 1200));
        books.add(new Book(2, "Book #2", "Author #2", 1500));
        books.add(new Book(3, "Book #3", "Author #3 ", 1900));

        Category category = new Category(books);
        Iterator<Book> iterator = category.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}