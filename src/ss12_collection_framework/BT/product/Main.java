package ss12_collection_framework.BT.product;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1,"a",100));
        productManager.addProduct(new Product(2,"b",121));
        productManager.addProduct(new Product(3,"c",111));
        productManager.displayProduct();
        productManager.editProduct(1,"d",200);
        productManager.displayProduct();
    }
}
