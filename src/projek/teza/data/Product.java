package projek.teza.data;

import java.util.Objects;

public class Product {
    public String name;
    public Integer price;

    public Product(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product name: "+ name + " Price: "+ price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return price != null ? price.equals(product.price) : product.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
