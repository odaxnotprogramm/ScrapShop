package agat.test.scrapShop.service;

import agat.test.scrapShop.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);

    void updateProduct(Product product);

    void addProduct(Product product);
}
