package edu.penzgtu.ip.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book implements Product {
    private int id;
    private String name;
    private String author;
    private int price;

    @Override
    public void getInformation() {
        System.out.printf("Book Name - %s%n", name);
    }
}
