package projek.teza.application;

import projek.teza.data.Product;

public class EqualsApp {
    public static void main(String[] args) {
    String first = "Eko";
     first = first + " " + "Khannedy";
        System.out.println(first);

        String second = "Eko Khannedy";
        System.out.println(second);

        System.out.println(first.equals(second));
    }

}
