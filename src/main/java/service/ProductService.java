package service;

import dao.CRUD_Product;
import model.Product;

import java.util.List;

public class ProductService {
    public static List<Product> products = CRUD_Product.getAll();

    public static void add(Product product) {
        products.add(product);
        CRUD_Product.save(product);
    }

    public static void edit(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                CRUD_Product.editproduct(id,product);
            }
        }
    }

    public static void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                CRUD_Product.deleteproduct(id);
            }
        }
    }
}
