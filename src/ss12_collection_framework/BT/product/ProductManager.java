package ss12_collection_framework.BT.product;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct (Product p){

        products.add(p);
    }
    void displayProduct(){
        for (Product o :products){
            System.out.println(o);
        }
    }
    void removeProduct(Product p){
        products.remove(p);
    }
    void searchProduct(int index){
        for (Product o: products){
            if (o.getId() == index){
                System.out.println(o.getId() + " " + o.getName() + " " + o.getPrice());
        }
        }
    }
    void editProduct(int id, String name, double price) {
        for (Product o : products) {
            if (o.getId() == id) {
                o.setName(name);
                o.setPrice(price);
                System.out.println("Complete fix");
                break;
            } else {
                System.out.println("NO Find id");
            }
        }
}
}
