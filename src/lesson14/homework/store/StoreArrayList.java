package lesson14.homework.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StoreArrayList {
    private ArrayList<Product> products = new ArrayList<Product>();

    public StoreArrayList() {
    }

    public StoreArrayList(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            System.out.println("Given product id is busy");
        } else {
            products.add(product);
        }
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

    public int getProductIndex(Product product) {
        return products.indexOf(product);
    }

    public void sortList() {
        Collections.sort(products);
    }

    @Override
    public String toString() {
        return "Products in the store" + products;
    }
}
