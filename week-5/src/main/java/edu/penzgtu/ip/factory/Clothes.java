package edu.penzgtu.ip.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Clothes implements Product {
    private int id;
    private String name;
    private String category;
    private int price;

    @Override
    public void getInformation() {
        System.out.printf("Clothes Name - %s%n", name);
    }
}
