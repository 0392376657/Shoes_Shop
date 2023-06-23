package ctd.shoesfix.service;

import ctd.shoesfix.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();
    Product getProductId(Long id);
}
