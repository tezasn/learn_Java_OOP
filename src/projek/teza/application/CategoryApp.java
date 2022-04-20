package projek.teza.application;

import projek.teza.data.Category;

public class CategoryApp {
    public static void main(String[] args) {


        var category = new Category();
        category.setId("Teza");
        category.setId(null);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
