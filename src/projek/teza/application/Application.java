package projek.teza.application;

import projek.teza.data.Product;

public class Application{
    public static void main(String[] args) {
        Product product = new Product("Ana", 50_000_000);
        System.out.println(product.name +" Harga "+ product.price);
    }
}