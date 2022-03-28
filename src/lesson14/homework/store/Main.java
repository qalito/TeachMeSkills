package lesson14.homework.store;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("storeHashSet......................................");
        StoreHashSet storeHashSet = new StoreHashSet();
        storeHashSet.addProduct(new Product(1,"Milk",15.8));
        storeHashSet.addProduct(new Product(20,"Milk",19.8));
        storeHashSet.addProduct(new Product(3,"Coffee Jo",118.8));
        System.out.println(storeHashSet);
        storeHashSet.editProduct(new Product(3,"Milk Jo",18.8));
        System.out.println(storeHashSet);
        storeHashSet.removeProduct(new Product(3));
        System.out.println(storeHashSet);
        storeHashSet.printProductList();
        System.out.println("storeHashSet......................................");
        System.out.println("storeArrayList....................................");
        StoreArrayList storeArrayList = new StoreArrayList();
        storeArrayList.addProduct(new Product(3,"Milk",15.8));
        storeArrayList.addProduct(new Product(1,"Milk",19.8));
        storeArrayList.addProduct(new Product(2,"Coffee Jo",118.8));
        System.out.println(storeArrayList);
        storeArrayList.editProduct(new Product(2,"Milk Jo",18.8));
        System.out.println(storeArrayList);
        storeArrayList.removeProduct(new Product(2));
        storeArrayList.printProductList();
        System.out.println(storeArrayList.getProductIndex(new Product(1)));
        storeArrayList.sortList();
        System.out.println(storeArrayList);
        System.out.println("storeArrayList....................................");
        System.out.println("storeLinkedList...................................");
        StoreLinkedList storeLinkedList = new StoreLinkedList();
        storeLinkedList.addProduct(new Product(7,"Milk",15.8));
        storeLinkedList.addProduct(new Product(21,"Milk",19.8));
        storeLinkedList.addProduct(new Product(14,"Coffee Jo",118.8));
        System.out.println(storeLinkedList);
        storeLinkedList.editProduct(new Product(14,"Milk Jo",18.8));
        System.out.println(storeLinkedList);
        storeLinkedList.printProductList();
        System.out.println(storeLinkedList.getProductIndex(new Product(2)));
        storeLinkedList.addFirstProduct(new Product(27,"Milk Jo",117.8));
        System.out.println(storeLinkedList);
        System.out.println(storeLinkedList.getFirstProduct());
        storeLinkedList.sortList();
        System.out.println(storeLinkedList);
        System.out.println("storeLinkedList...................................");
    }
}
