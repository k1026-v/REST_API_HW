package de.ait.products.serveses.impl;

import de.ait.products.models.Product;
import de.ait.products.repositories.ProductRepository;
import de.ait.products.serveses.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
