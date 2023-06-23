package ctd.shoesfix.service;

import ctd.shoesfix.model.Product;
import ctd.shoesfix.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public Product getProductId(Long id) {
        return productRepository.getById(id);
    }
}
