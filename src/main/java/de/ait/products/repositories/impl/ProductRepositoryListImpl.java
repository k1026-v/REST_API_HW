package de.ait.products.repositories.impl;

import de.ait.products.models.Product;
import de.ait.products.repositories.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryListImpl implements ProductRepository {

    List<Product> products = new ArrayList<>();

    public ProductRepositoryListImpl (){
        Product product1 = new Product("Milk",12, true);
        Product product2 = new Product("Ice", 3,true);
        Product product3 = new Product("Apple", 2, false);
        Product product4 = new Product("Orange", 6, true);

        this.products = Arrays.asList(product1, product2, product3, product4);


    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
