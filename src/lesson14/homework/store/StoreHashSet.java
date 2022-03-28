package lesson14.homework.store;

import java.util.Collections;
import java.util.HashSet;

public class StoreHashSet {
    private HashSet<Product> products = new HashSet<Product>();

    public StoreHashSet() {
    }

    public StoreHashSet(HashSet<Product> products) {
        this.products = products;
    }

    public HashSet<Product> getProducts() {
        return products;
    }

    public void setProducts(HashSet<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            System.out.println("Given product id is busy");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            System.out.println("Remove error product not found");
        }
    }

    public void editProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
            products.add(product);
        } else {
            System.out.println("Edit error product not found");
        }
    }

    public void printProductList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "Products in the store" + products;
    }

}
